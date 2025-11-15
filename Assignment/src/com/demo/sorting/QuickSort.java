package com.demo.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort 
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
	
	
	public static void quickSort(int [] arr, int start, int end)
	{
		if(start < end)
		{
			int pivot = partition(arr, start, end);
			quickSort(arr, start, pivot-1);
			quickSort(arr, pivot+1, end);
		}
	}

	public static int partition(int [] arr, int start, int end)
	{
		int i = start;
		int j = end;
		
		int pivot = start;
		
		while(i < j)
		{
			while(i<end && arr[i] <= arr[pivot])
			{
				i++;
			}
			
			while(j>start && arr[j] > arr[pivot])
			{
				j--;
			}
			
			if(i < j)
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		if(pivot != j)
		{
			int temp = arr[pivot];
			arr[pivot] = arr[j];
			arr[j] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
		
		return j;
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
		
		
		quickSort(arr, 0, arr.length-1);
		System.out.println("Quick sort");
		displayData(arr);
		
	}
}
