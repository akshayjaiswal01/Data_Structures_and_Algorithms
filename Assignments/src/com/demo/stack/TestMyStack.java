package com.demo.stack;

import java.util.Scanner;

import javax.sql.rowset.CachedRowSet;

public class TestMyStack {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the stack");
		int size = sc.nextInt();
		
		MyStack stack = new MyStack(size);
		
		int choice;
		
		do {
			System.out.println("1. Push Operation \n"
							 + "2. Pop Operation \n"
							 + "3. Peek Element \n"
							 + "4. Check Stack is full \n"
							 + "5. Check stack is empty \n"
							 + "6. Check String is palindrome or not");
			
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
					int num = stack.peek();
					System.out.println("Peek element is: "+num);
				}
				
				case 4 ->
				{
					Boolean status = stack.isFull();
					if(status)
					{
						System.out.println("Stack is full");
					}
					else
					{
						System.out.println("Stack is not full");
					}
				}
				
				case 5 ->
				{
					Boolean status = stack.isEmpty();
					if (status) 
					{
						System.out.println("Stack is empty");
					}
					else {
						System.out.println("Stack is not empty");
					}
					
				}
				
//				case 6 ->
//				{
//					sc.nextLine();
//					System.out.println("Enter String: ");
//					String string = sc.next();
//					
//					boolean status = stack.checkPalindrome(string);
//					if(status)
//					{
//						System.out.println("String is palindrome : "+string);
//					}
//					else {
//						System.out.println("String is not palindrome : "+string);
//					}
//				}
			
				default ->
				{
					System.out.println("Invalid choice");
				}
			
			}
			
		} while (choice != 6);

	}

	

}
