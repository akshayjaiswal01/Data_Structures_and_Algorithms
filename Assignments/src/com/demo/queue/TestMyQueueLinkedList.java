package com.demo.queue;

import java.util.Scanner;

public class TestMyQueueLinkedList {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		MyQueueLinkedList queue = new MyQueueLinkedList();
		
		int choice;
		
		do {
			System.out.println("1. Queue Operation \n"
							 + "2. Dequeue Operation \n"
							 + "3. Check Dequeue is empty");
			
			System.out.println("Enter your choice");
			choice =sc.nextInt();
			
			switch (choice) 
			{
				case 1 ->
				{
					System.out.println("Enter Element: ");
					int num = sc.nextInt();
					
					queue.enQueue(num);
				}
				
				case 2 ->
				{
					int num = queue.deQueue();
					System.out.println("DeQueue..."+num);
				}
				
				case 3 ->
				{
					Boolean status = queue.isEmpty();
					if (status) 
					{
						System.out.println("Queue is empty");
					}
					else {
						System.out.println("Queue is not empty");
					}
					
				}
			
				default ->
				{
					System.out.println("Invalid choice");
				}
			
			}
			
		} while (choice != 4);
		
	}

}
