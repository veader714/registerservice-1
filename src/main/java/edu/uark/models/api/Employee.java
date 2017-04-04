package edu.uark.models.api;

import java.time.LocalDateTime;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;

import edu.uark.models.entities.EmployeeEntity;
import edu.uark.models.api.enums.EmployeeApiRequestStatus;
import edu.uark.models.api.enums.ProductApiRequestStatus;


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
	
	public Employee setApiRequestStatus(EmployeeApiRequestStatus apiRequestStatus) {
		if (this.apiRequestStatus != apiRequestStatus) {
			this.apiRequestStatus = apiRequestStatus;
		}
		
		return this;
	}
	
	private String apiRequestMessage;
	public String getApiRequestMessage() {
		return this.apiRequestMessage;
	}
	public Employee setApiRequestMessage(String apiRequestMessage) {
		if (!StringUtils.equalsIgnoreCase(this.apiRequestMessage, apiRequestMessage)) {
			this.apiRequestMessage = apiRequestMessage;
		}
		
		return this;
	}
	
	
	public Employee(EmployeeEntity employeeEntity){
		this.FirstName = employeeEntity.getFirstName();
		this.LastName = employeeEntity.getLastName();
		this.id = employeeEntity.getId();
		this.EmployeeId = employeeEntity.getEmployeeId();
		this.apiRequestMessage = StringUtils.EMPTY;
		this.apiRequestStatus = EmployeeApiRequestStatus.OK;
	}
	
	public Employee(){
		this.FirstName = "";
		this.LastName = "";
		this.id = new UUID(0, 0);
		this.EmployeeId = "";
		this.apiRequestMessage = StringUtils.EMPTY;
		this.apiRequestStatus = EmployeeApiRequestStatus.OK;
	}
	
	
}
