package com.demo.employee;

import java.util.Scanner;

public class EmployeeService 
{
	static Employee [] emparr;
	static int arrsize = -1;

	public EmployeeService() 
	{
		super();
		this.emparr = new Employee[10];
	}
	
	public void addEmployee()
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Employee ID: ");
		int eid = scanner.nextInt();
		
		scanner.nextLine();
		System.out.println("Enter Employee Name: ");
		String ename =scanner.next();
		
		System.out.println("Enter Employee Salary: ");
		double salary = scanner.nextDouble();
		
		Employee emp = new Employee(eid, ename, salary);
		
		arrsize++;
		emparr[arrsize] = emp;
		
	}
	
	public void display()
	{
		for(int i=0; i<=arrsize; i++)
		{
			System.out.println(emparr[i]);
		}
	}

	public void sortBySalary() 
	{
		for(int i=0; i<arrsize; i++)
		{
			for(int j = 0; j<arrsize-i; j++)
			{
				if(emparr[j].getSalary() > emparr[j+1].getSalary())
				{
					Employee temp = emparr[j];
					emparr[j] = emparr[j+1];
					emparr[j+1] = temp;
				}
			}
		}
		
	}
	
	
}
