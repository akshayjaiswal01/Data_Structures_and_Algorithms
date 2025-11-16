package com.demo.stack;

import java.util.Scanner;

public class TestGenericStack {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		int choice;
		do 
		{
			System.out.println("Which type of Stack you want to create: \n"
							 + "1. Integer \n"
							 + "2. String \n"
							 + "3. Check String is palindrome or not \n"
							 + "4. Exit");
			
			System.out.println("Enter Your choice: ");
			choice = scanner.nextInt();
			
			switch(choice)
			{
				case 1 ->
				{
					System.out.println("Enter the size of the Integer Stack: ");
					int size = scanner.nextInt();
					
					GenericStack<Integer> stack = new GenericStack<Integer>(size);
					
					int ch;
					do 
					{
						System.out.println("1. Push operation \n"
										 + "2. Pop operation \n"
										 + "3. Exit \n");
						
						System.out.println("Enter Choice: ");
						ch = scanner.nextInt();
						
						switch(ch)
						{
							case 1->
							{
								System.out.println("Enter Data to push: ");
								Integer data = scanner.nextInt();
								
								stack.push(data);
							}
							
							case 2 ->
							{
								Integer data = stack.pop();
								System.out.println("pop..."+data);
							}
							
							case 3 ->
							{
								break;
							}
							
							default ->
							{
								System.out.println("Invalid choice");
							}
						}
						
					} while (ch != 3);	
				}
				
				case 2 ->
				{
					System.out.println("Enter the size of the String Stack: ");
					int size = scanner.nextInt();
					
					GenericStack<String> stack = new GenericStack<String>(size);
					
					int ch;
					do 
					{
						System.out.println("1. Push operation \n"
										 + "2. Pop operation \n"
										 + "3. Exit \n");
						
						System.out.println("Enter Choice: ");
						ch = scanner.nextInt();
						
						switch(ch)
						{
							case 1->
							{
								System.out.println("Enter Data to push: ");
								String data = scanner.next();
								
								stack.push(data);
							}
							
							case 2 ->
							{
								String data = stack.pop();
								System.out.println("pop..."+data);
							}
							
							case 3 ->
							{
								break;
							}
							
							default ->
							{
								System.out.println("Invalid choice");
							}
						}
						
					} while (ch != 3);	
				}
				
				
				case 3 ->
				{
					System.out.println("Enter String: ");
					String string = scanner.next();
					
					int size = string.length();
					
					GenericStack<Character> stack = new GenericStack<Character>(size);
					
					for(int i=0; i<string.length(); i++)
					{
						stack.push(string.charAt(i));
					}
					
					String reverse = "";
					for(int i=0; i<string.length(); i++)
					{
						reverse = reverse + stack.pop();
					}
					
					if(string.equals(reverse))
					{
						System.out.println("String is palindrome: "+string);
					}
					else {
						System.out.println("String is not palindrome: "+string);
					}
				}
				
				case 4 ->
				{
					System.exit(0);
				}
				
				default ->
				{
					System.out.println("Invalid choice");
				}
			}
			
			
			
		} while (choice != 4);

	}

}
