package com.masai.crud.EmployeeDAO;

import com.masai.crud.model.Employee;

public interface EmployeeDAO {

	public String registerEmployee(Employee employee);
	
	public void getEmployeeById(int empId);
	
	public String deleteEmployeeById(int empId);
	
	public String updateEmployeeSalary(int empId, int amount);
}
