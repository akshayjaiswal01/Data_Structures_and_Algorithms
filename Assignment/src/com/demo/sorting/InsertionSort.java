package com.demo.sorting;

import java.util.Scanner;

public class InsertionSort 
{
	public static void  acceptData(int [] arr)
	{
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr.length; i++)
		{
			System.out.print("Enter "+i+" element: ");
			arr[i] = sc.nextInt();
		}
		System.out.println();
	}
	
	public static void displayData(int [] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void insertionSort(int [] arr)
	{
		for(int i=1; i<arr.length; i++)
		{
			int j = i-1;
			int key = arr[i];
			
			while(j >= 0 && arr[j] > key)
			{
				arr[j+1] = arr[j];
				j--;
			}
			
			arr[j+1] = key;
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		
		int [] arr = new int[size];
		
		System.out.println("ENter array details");
		acceptData(arr);
		
		System.out.println("Array is: ");
		displayData(arr);
		
		insertionSort(arr);
		System.out.println("Insertion Sort: ");
		displayData(arr);
	}
}
