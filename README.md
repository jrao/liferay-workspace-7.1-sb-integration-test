# Liferay 7.1 Workspace Demonstrating How to Write Integration Tests for Service Builder Modules

## Description

This workspace is an adaptation of <https://github.com/gamerson/arquillian-workspace-example> (designed for 7.0) for 7.1. It also replaces the simple service and associated test with a Service Builder service and associated test.

## Usage

1. Unzip the `liferay-workspace-7.1-sb-integration-test.zip` file.

2. In a terminal, go to the `liferay-workspace-7.1-sb-integration-test/` root dir and run `blade gw initBundle`.

3. Run `blade gw setUpTestableTomcat`.

4. Run `blade gw startTestableTomcat -x stopTestableTomcat`. Note that the `-x` flag specifies a task to be excluded. And adding the `-m` flag prints the tasks to be run without actually running any tasks.

5. After Liferay has started, tail the Liferay log with this command: `tail -f bundles/logs/liferay.2019-12-05.log` (adjust command to match the actual logfile which depends on the current date).

6. In a new terminal, go to the `liferay-workspace-7.1-sb-integration-test/modules/sample-sb/sample-sb-api/` dir and run `blade gw deploy`.

    Note that this step is required to work around an issue where the test fails due to failing to find the API module.

7. Go back to the `liferay-workspace-7.1-sb-integration-test/` dir and run `blade gw testIntegration -x startTestableTomcat -x stopTestableTomcat`.

    Known issue: The following error occurs.

        com.liferay.sample.sb.test.SampleSBIntegrationTest STANDARD_ERROR
            SLF4J: The requested version 1.5.11 by your slf4j binding is not compatible with [1.6, 1.7]
            SLF4J: See http://www.slf4j.org/codes.html#version_mismatch for further details.
            log4j:WARN No appenders could be found for logger (org.jboss.arquillian.container.test.spi.client.deployment.ApplicationArchiveProcessor).
            log4j:WARN Please initialize the log4j system properly.
            log4j:WARN See http://logging.apache.org/log4j/1.2/faq.html#noconfig for more info.

8. The test should succeed and generate a report at `liferay-workspace-7.1-sb-integration-test/modules/sample-sb/sample-sb-service/build/reports/tests/testIntegration/index.html`.

9. When you're done your testing session, remember to shut down Liferay with `./shutdown.sh` from the Tomcat `bin/` directory.

Note: I tried breaking the integration test out of the service module into a separate integration test module but ran into this error with that approach:

    java.io.IOException: Start of bundle with id 1033 failed with message: Could not resolve module: com.liferay.sample.sb.test [1033]
      Unresolved requirement: Import-Package: org.jboss.osgi.metadata; resolution:="optional"
      Unresolved requirement: Import-Package: org.jboss.shrinkwrap.descriptor.spi.node; resolution:="optional"
      Unresolved requirement: Import-Package: null

This error occurred because the JAR created by the Arquillian extension includes a null import. I'm not sure why this occurs. But a workaround is to keep the integration tests for a Service Builder service in the service module. And remember to manually deploy the API module (and make sure that the service module has not been deployed) before invoking the integration tests with `blade gw testIntegration -x startTestableTomcat -x stopTestableTomcat`.
