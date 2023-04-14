package com.masai.crud.EmployeeDAO.Impl;

import javax.persistence.EntityManager;

import com.masai.crud.EmployeeDAO.EmployeeDAO;
import com.masai.crud.Utils.Utils;
import com.masai.crud.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO{

	public String registerEmployee(Employee employee) {
		// TODO Auto-generated method stub
		EntityManager em=Utils.getEntityManager();
		em.getTransaction().begin();
		em.persist(employee);
		em.getTransaction().commit();
		em.close();
		return "Employee Added!";
	}

	public  void getEmployeeById(int empId) {
		// TODO Auto-generated method stub
		EntityManager em=Utils.getEntityManager();
		Employee emp=new Employee();
		em.getTransaction().begin();
		emp=em.find(Employee.class, empId);
		em.getTransaction().commit();
		em.close();
		if(emp.toString().equalsIgnoreCase(null)) {
			System.out.println("Data not found!");
		}else {
			System.out.println(emp.toString());
		}
		
	}

	public String deleteEmployeeById(int empId) {
		// TODO Auto-generated method stub
		EntityManager em=Utils.getEntityManager();
		Employee emp=new Employee();
		emp=em.find(Employee.class,empId);
		em.getTransaction().begin();
		em.remove(emp);
		em.getTransaction().commit();
		em.close();
		return "Employee Deleted!";
	}

	public String updateEmployeeSalary(int empId, int amount) {
		// TODO Auto-generated method stub
		EntityManager em=Utils.getEntityManager();
		Employee emp=new Employee();
		emp=em.find(Employee.class, empId);
		em.getTransaction().begin();
		emp.setSalary(emp.getSalary()+amount);
		em.merge(emp);
		em.getTransaction().commit();
		em.close();
		return "Employee Updated!";
	}

}
