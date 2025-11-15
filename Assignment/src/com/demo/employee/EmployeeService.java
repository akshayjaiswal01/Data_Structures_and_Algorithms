package com.demo.employee;

import java.util.Scanner;

public class EmployeeService 
{
	private Employee [] emp;

	public EmployeeService() 
	{
		this.emp = new Employee[20];
	}

	public void addEmployee(int num) 
	{
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<num; i++)
		{
			System.out.println("Enter ID: ");
			int eid = sc.nextInt();
			
			sc.nextLine();
			System.out.println("ENter Name: ");
			String name = sc.next();
			
			System.out.println("ENter Salary: ");
			double salary = sc.nextDouble();
			
			Employee e = new Employee(eid, name, salary);
			
			emp[i] = e;
		
		}
	}
	
	
	
	
	
	
}
