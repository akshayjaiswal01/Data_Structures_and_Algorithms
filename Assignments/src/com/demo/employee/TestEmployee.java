package com.demo.employee;

import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		EmployeeService eService = new EmployeeService();
		
		while(true)
		{
			System.out.println("1. Add Employee (max 10) \n"
							 + "2. Disaply All \n"
							 + "3. sort on salary ");
			
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1 ->
				{
					System.out.println("How many employee you want to add (Max size 10)");
					int size = sc.nextInt();
					
					for(int i=0; i<size; i++)
					{
						eService.addEmployee();
						System.out.println("==============================");
					}
				}
				
				case 2->
				{
					eService.display();
				}
				
				case 3 ->
				{
					eService.sortBySalary();
				}
			}
		}
		
		
	}

}
