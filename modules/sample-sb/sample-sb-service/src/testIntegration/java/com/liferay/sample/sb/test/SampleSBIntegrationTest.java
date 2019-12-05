package com.liferay.sample.sb.test;

import com.liferay.arquillian.containter.remote.enricher.Inject;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.sample.sb.service.EmployeeLocalService;

import java.io.File;
import java.io.IOException;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
public class SampleSBIntegrationTest {
	
	@Deployment
	public static JavaArchive create() throws Exception {
		final File jarFile = new File(System.getProperty("jarFile"));

		return ShrinkWrap.createFromZipFile(JavaArchive.class, jarFile);
	}

	@Test
	public void testEmployeeLocalService() throws IOException, PortalException {
		Assert.assertNotNull(_employeeLocalService);
		
		int employeeCount = _employeeLocalService.getEmployeesCount();
		
		Assert.assertEquals(0, employeeCount);
	}

	@Inject
	private EmployeeLocalService _employeeLocalService;

}
