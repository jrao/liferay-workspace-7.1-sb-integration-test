/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.sample.sb.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Employee}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Employee
 * @generated
 */
@ProviderType
public class EmployeeWrapper implements Employee, ModelWrapper<Employee> {

	public EmployeeWrapper(Employee employee) {
		_employee = employee;
	}

	@Override
	public Class<?> getModelClass() {
		return Employee.class;
	}

	@Override
	public String getModelClassName() {
		return Employee.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("employeeId", getEmployeeId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("employeeName", getEmployeeName());
		attributes.put("employeeEmail", getEmployeeEmail());
		attributes.put("employeeJob", getEmployeeJob());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long employeeId = (Long)attributes.get("employeeId");

		if (employeeId != null) {
			setEmployeeId(employeeId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String employeeName = (String)attributes.get("employeeName");

		if (employeeName != null) {
			setEmployeeName(employeeName);
		}

		String employeeEmail = (String)attributes.get("employeeEmail");

		if (employeeEmail != null) {
			setEmployeeEmail(employeeEmail);
		}

		String employeeJob = (String)attributes.get("employeeJob");

		if (employeeJob != null) {
			setEmployeeJob(employeeJob);
		}
	}

	@Override
	public Object clone() {
		return new EmployeeWrapper((Employee)_employee.clone());
	}

	@Override
	public int compareTo(Employee employee) {
		return _employee.compareTo(employee);
	}

	/**
	 * Returns the company ID of this employee.
	 *
	 * @return the company ID of this employee
	 */
	@Override
	public long getCompanyId() {
		return _employee.getCompanyId();
	}

	/**
	 * Returns the create date of this employee.
	 *
	 * @return the create date of this employee
	 */
	@Override
	public Date getCreateDate() {
		return _employee.getCreateDate();
	}

	/**
	 * Returns the employee email of this employee.
	 *
	 * @return the employee email of this employee
	 */
	@Override
	public String getEmployeeEmail() {
		return _employee.getEmployeeEmail();
	}

	/**
	 * Returns the employee ID of this employee.
	 *
	 * @return the employee ID of this employee
	 */
	@Override
	public long getEmployeeId() {
		return _employee.getEmployeeId();
	}

	/**
	 * Returns the employee job of this employee.
	 *
	 * @return the employee job of this employee
	 */
	@Override
	public String getEmployeeJob() {
		return _employee.getEmployeeJob();
	}

	/**
	 * Returns the employee name of this employee.
	 *
	 * @return the employee name of this employee
	 */
	@Override
	public String getEmployeeName() {
		return _employee.getEmployeeName();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _employee.getExpandoBridge();
	}

	/**
	 * Returns the group ID of this employee.
	 *
	 * @return the group ID of this employee
	 */
	@Override
	public long getGroupId() {
		return _employee.getGroupId();
	}

	/**
	 * Returns the modified date of this employee.
	 *
	 * @return the modified date of this employee
	 */
	@Override
	public Date getModifiedDate() {
		return _employee.getModifiedDate();
	}

	/**
	 * Returns the primary key of this employee.
	 *
	 * @return the primary key of this employee
	 */
	@Override
	public long getPrimaryKey() {
		return _employee.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _employee.getPrimaryKeyObj();
	}

	/**
	 * Returns the user ID of this employee.
	 *
	 * @return the user ID of this employee
	 */
	@Override
	public long getUserId() {
		return _employee.getUserId();
	}

	/**
	 * Returns the user name of this employee.
	 *
	 * @return the user name of this employee
	 */
	@Override
	public String getUserName() {
		return _employee.getUserName();
	}

	/**
	 * Returns the user uuid of this employee.
	 *
	 * @return the user uuid of this employee
	 */
	@Override
	public String getUserUuid() {
		return _employee.getUserUuid();
	}

	/**
	 * Returns the uuid of this employee.
	 *
	 * @return the uuid of this employee
	 */
	@Override
	public String getUuid() {
		return _employee.getUuid();
	}

	@Override
	public int hashCode() {
		return _employee.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _employee.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _employee.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _employee.isNew();
	}

	@Override
	public void persist() {
		_employee.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_employee.setCachedModel(cachedModel);
	}

	/**
	 * Sets the company ID of this employee.
	 *
	 * @param companyId the company ID of this employee
	 */
	@Override
	public void setCompanyId(long companyId) {
		_employee.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this employee.
	 *
	 * @param createDate the create date of this employee
	 */
	@Override
	public void setCreateDate(Date createDate) {
		_employee.setCreateDate(createDate);
	}

	/**
	 * Sets the employee email of this employee.
	 *
	 * @param employeeEmail the employee email of this employee
	 */
	@Override
	public void setEmployeeEmail(String employeeEmail) {
		_employee.setEmployeeEmail(employeeEmail);
	}

	/**
	 * Sets the employee ID of this employee.
	 *
	 * @param employeeId the employee ID of this employee
	 */
	@Override
	public void setEmployeeId(long employeeId) {
		_employee.setEmployeeId(employeeId);
	}

	/**
	 * Sets the employee job of this employee.
	 *
	 * @param employeeJob the employee job of this employee
	 */
	@Override
	public void setEmployeeJob(String employeeJob) {
		_employee.setEmployeeJob(employeeJob);
	}

	/**
	 * Sets the employee name of this employee.
	 *
	 * @param employeeName the employee name of this employee
	 */
	@Override
	public void setEmployeeName(String employeeName) {
		_employee.setEmployeeName(employeeName);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {

		_employee.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_employee.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_employee.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	 * Sets the group ID of this employee.
	 *
	 * @param groupId the group ID of this employee
	 */
	@Override
	public void setGroupId(long groupId) {
		_employee.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this employee.
	 *
	 * @param modifiedDate the modified date of this employee
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_employee.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_employee.setNew(n);
	}

	/**
	 * Sets the primary key of this employee.
	 *
	 * @param primaryKey the primary key of this employee
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		_employee.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_employee.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	 * Sets the user ID of this employee.
	 *
	 * @param userId the user ID of this employee
	 */
	@Override
	public void setUserId(long userId) {
		_employee.setUserId(userId);
	}

	/**
	 * Sets the user name of this employee.
	 *
	 * @param userName the user name of this employee
	 */
	@Override
	public void setUserName(String userName) {
		_employee.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this employee.
	 *
	 * @param userUuid the user uuid of this employee
	 */
	@Override
	public void setUserUuid(String userUuid) {
		_employee.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this employee.
	 *
	 * @param uuid the uuid of this employee
	 */
	@Override
	public void setUuid(String uuid) {
		_employee.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Employee> toCacheModel() {
		return _employee.toCacheModel();
	}

	@Override
	public Employee toEscapedModel() {
		return new EmployeeWrapper(_employee.toEscapedModel());
	}

	@Override
	public String toString() {
		return _employee.toString();
	}

	@Override
	public Employee toUnescapedModel() {
		return new EmployeeWrapper(_employee.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _employee.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EmployeeWrapper)) {
			return false;
		}

		EmployeeWrapper employeeWrapper = (EmployeeWrapper)obj;

		if (Objects.equals(_employee, employeeWrapper._employee)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _employee.getStagedModelType();
	}

	@Override
	public Employee getWrappedModel() {
		return _employee;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _employee.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _employee.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_employee.resetOriginalValues();
	}

	private final Employee _employee;

}