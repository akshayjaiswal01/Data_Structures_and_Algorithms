package com.demo.stack;

import java.util.Scanner;

public class TestMyStackLinkedList {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		MyStackLinkedList stack = new MyStackLinkedList();
		
		int choice;
		
		do {
			System.out.println("1. Push Operation \n"
							 + "2. Pop Operation \n"
							 + "3. Check stack is empty");
			
			System.out.println("Enter your choice");
			choice =sc.nextInt();
			
			switch (choice) 
			{
				case 1 ->
				{
					System.out.println("Enter Element: ");
					int num = sc.nextInt();
					stack.push(num);
					
				}
				
				case 2 ->
				{
					int num = stack.pop();
					System.out.println("Pop..."+num);
				}
				
				case 3 ->
				{
					boolean status = stack.isEmpty();
					if(status)
					{
						System.out.println("Stack is empty");
					}
					else {
						System.out.println("Stack is not empty");
					}
				}
				
				
				default ->
				{
					System.out.println("Invalid choice");
				}
			
			}
			
		} while (choice != 6);

	}

}
