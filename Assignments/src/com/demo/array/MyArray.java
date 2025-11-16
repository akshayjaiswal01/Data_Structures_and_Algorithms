package com.demo.array;

import java.util.Scanner;

public class MyArray 
{
	public static int [] arrayAddition(int arr[])
	{
		int result[] = new int[arr.length];
		for(int i=0; i<arr.length; i++)
		{
			int sum = 0;
			for(int j=0; j<arr.length; j++)
			{
				if(i == j)
				{
					continue;
				}
				else {
					sum = sum + arr[j];
				}
			}
			
			result[i] = sum;
		}
		
		return result;
	}
	
	public static void acceptArray(int [] arr)
	{
		System.out.println("Enter array details");
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
	}
	
	public static void displayArray(int [] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter thesize of the array: ");
		int size = scanner.nextInt();
		
		int [] arr = new int [size];
		
		acceptArray(arr);
		
		System.out.println("Original array");
		displayArray(arr);
		
		
		int temp [] = arrayAddition(arr);
		
		System.out.println("Result");
		for(int x : temp)
		{
			System.out.print(x+" ");
		}
		System.out.println();
	}
}
