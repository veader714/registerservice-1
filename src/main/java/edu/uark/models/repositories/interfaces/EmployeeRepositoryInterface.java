package edu.uark.models.repositories.interfaces;

public class EmployeeRepositoryInterface extends BaseRepositoryInterface<EmployeeEntity>{
	EmployeeEntity byEmployeeId(String employeeId);
}
