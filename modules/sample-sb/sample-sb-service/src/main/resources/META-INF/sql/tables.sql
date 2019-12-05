create table EMPLOYEE_Employee (
	uuid_ VARCHAR(75) null,
	employeeId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	employeeName VARCHAR(75) null,
	employeeEmail VARCHAR(75) null,
	employeeJob VARCHAR(75) null
);