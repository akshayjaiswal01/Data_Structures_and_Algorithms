package com.demo.queue;

import java.util.Scanner;

public class TestCircularQueue 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the size of the queue");
		int size = scanner.nextInt();
		
		CircularQueue queue = new CircularQueue(size);
		
		while(true)
		{
			System.out.println("Enter number (-1 for stop) ");
			int num =scanner.nextInt();
			
			if(num == -1)
			{
				break;
			}
			
			queue.enQueue(num);
		}
		
		System.out.println("Total number of removed: "+queue.count);
	}
}
