package edu.uark.controllers;

import java.util.UUID;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.uark.commands.employees.EmployeeLoginQuery;
import edu.uark.commands.employees.EmployeeQuery;
import edu.uark.commands.products.ProductSaveCommand;
import edu.uark.commands.products.ProductsQuery;
import edu.uark.models.api.Employee;

public class EmployeeRestController {
	@RequestMapping(value = "/apiv0/{employeeId}", method = RequestMethod.GET)  //Changed to a post request
	public Employee getEmployee(@PathVariable UUID employeeId) {
		return (new EmployeeQuery()).setEmployeeId(employeeId).execute();
	}

	@RequestMapping(value = "/apiv0/employeeLogin/{employeeId}", method = RequestMethod.POST)
	public Employee getByEmployeeId(@PathVariable String employeeLoginString) {
		return (new EmployeeLoginQuery()).setEmployeeId(employeeLoginString).execute();
	}

	@RequestMapping(value = "/apiv0/employees", method = RequestMethod.GET)
	public Employee getEmployees() {
		return (new EmployeeQuery()).execute();
	}
	
	/*@RequestMapping(value = "/apiv0/", method = RequestMethod.PUT)  //Need to ask about
	public Employee putEmployee(@RequestBody Employee employee) {
		return (new EmployeeLoginQuery()).
			setApiEmployee(employee).
			execute();
	}*/

	@ResponseBody
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test() {
		return "Successful test. (EmployeeRestController)";
	}
}
