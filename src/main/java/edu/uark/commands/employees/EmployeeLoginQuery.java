package edu.uark.commands.employees;

import org.apache.commons.lang3.StringUtils;

import edu.uark.commands.ResultCommandInterface;
import edu.uark.models.api.Employee;

public class EmployeeLoginQuery implements ResultCommandInterface<Employee>{
	public Employee execute()
	{
		if (StringUtils.isBlank)
	}
	
	private String employeeId;
	private String passwordHash;
	public void setPasswordHash(String pw)
	{
		passwordHash = pw;
	}
	public void setEmployeeId(String emp)
	{
		employeeId = emp;
	}
	public String getPasswordHash() //maybe should be protected...
	{
		return passwordHash;
	}
	public String getEmployeeId()
	{
		return employeeId;
	}
	
}
