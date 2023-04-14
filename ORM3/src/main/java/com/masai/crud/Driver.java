package com.masai.crud;

import java.util.Scanner;

import com.masai.crud.EmployeeDAO.EmployeeDAO;
import com.masai.crud.EmployeeDAO.Impl.EmployeeDAOImpl;
import com.masai.crud.model.Employee;

public class Driver {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Employee emp=new Employee();
	EmployeeDAO emd=new EmployeeDAOImpl();
	int choice=0;
	do {
		System.out.println("0. Exit");
		System.out.println("1. Add Employee");
		System.out.println("2. Get Employee by ID");
		System.out.println("3. Delete Employee");
		System.out.println("4. Update Employee");
		choice=sc.nextInt();
		switch(choice) {
		case 0:
			System.out.println("Thanks for visiting us!");
			break;
		case 1:
			System.out.println("Enter id;");
			int id=sc.nextInt();
			System.out.println("2. Enter name:");
			String name=sc.next();
			System.out.println("3. Enter address:");
			String address=sc.next();
			System.out.println("4. Enter salary:");
			int salary=sc.nextInt();
			emp=new Employee(id,name,address,salary);
			System.out.println(emd.registerEmployee(emp));
			break;
		case 2:
			System.out.println("Enter ID:");
			int id1=sc.nextInt();
			emd.getEmployeeById(id1);
			break;
		case 3:
			System.out.println("Enter ID:");
			int id2=sc.nextInt();
			System.out.println(emd.deleteEmployeeById(id2));
			break;
		case 4:	
			System.out.println("Enter ID:");
			int id3=sc.nextInt();
			System.out.println("Enter amount to be added more:");
			int sal=sc.nextInt();
			System.out.println(emd.updateEmployeeSalary(id3, sal));
			break;
		default:
			System.out.println("Please select the right option!");
			break;
		}
	}while(choice!=0);
}
}
