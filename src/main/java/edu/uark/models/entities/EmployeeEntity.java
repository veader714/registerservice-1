package edu.uark.models.entities;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import edu.uark.dataaccess.entities.BaseEntity;
import edu.uark.models.repositories.EmployeeRepository;

public class EmployeeEntity extends BaseEntity<EmployeeEntity>{
	
	private String LastName;
	private String FirstName;
	private String employeeId;
	private String password;
	
	@Override
	protected void fillFromRecord(ResultSet rs) throws SQLException
	{
		
	}
	@Override
	protected Map<String, Object> fillRecord(Map<String,Object> record)
	{
		return record;
	}
	public EmployeeEntity()
	{
		super(new EmployeeRepository());
	}
	
	public String getFirstName(){
		return FirstName;
	}
	
	public String getLastName(){
		return LastName;
	}
	
	public String getEmployeeId(){
		return employeeId;
	}
	
}
