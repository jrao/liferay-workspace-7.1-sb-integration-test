create index IX_898432D9 on EMPLOYEE_Employee (employeeEmail[$COLUMN_LENGTH:75$]);
create index IX_36A293F9 on EMPLOYEE_Employee (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_C981C4BB on EMPLOYEE_Employee (uuid_[$COLUMN_LENGTH:75$], groupId);