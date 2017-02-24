package edu.uark.models.api;

import java.util.UUID;

import edu.uark.models.api.enums.EmployeeApiRequestStatus;


public class Employee {
	private UUID id;
	private String FirstName;
	private String LastName;
	private String EmployeeId;
	
	public UUID getId() {
		return this.id;
	}
	public String getEmployeeId()
	{
		return this.EmployeeId;
	}
	public String getFirst()
	{
		return this.FirstName;
	}
	public String getLast()
	{
		return this.LastName;
	}
	
	
	private EmployeeApiRequestStatus apiRequestStatus;
	public EmployeeApiRequestStatus getApiRequestStatus()
	{
		return this.apiRequestStatus;
	}
	
	
}
