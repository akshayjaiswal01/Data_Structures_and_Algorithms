package com.demo.arrays1d;

import java.util.Scanner;

public class My1DArray 
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
	
	
	public static int additionOfDigits(int [] arr)
	{
		int sum = 0;
		
		for(int i=0; i<arr.length; i++)
		{
			int num = arr[i];
			
			while(num > 0)
			{
			
				int digit = num % 10;
				
				sum = sum + digit;
				
				num = num/10;
			}
		}
		
		return sum;
	}
	
	public static int [] findFactorialOfPrime(int arr[])
	{
		int temp [] = new int[arr.length];
		
		for(int i=0; i<arr.length; i++)
		{
			if(isPrime(arr[i]))
			{
				int fact = 1;
				
				for(int j = 2; j<=arr[i]; j++)
				{
					fact = fact * j;
				}
				
				temp[i] = fact;
			}
			
			else
			{
				temp[i] = -1;
			}
		}
		
		return temp;
	}

	private static boolean isPrime(int num)
	{
		if(num <= 1)
		{
			return false;
		}
		
		for(int i=2; i<num; i++)
		{
			if(num % i == 0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static int findMaxPrime(int arr[])
	{
		int max = 0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(isPrime(arr[i]))
			{
				if(arr[i] > max)
				{
					max = arr[i];
				}
			}
		}
		return max;
	}
	
	public static int[] copyArray(int arr [])
	{
		int temp [] = new int[arr.length];
		
		for(int i=0; i<temp.length; i++)
		{
			temp[i] = arr[i];
		}
		return temp;
	}

	private static int reverse(int num) 
	{
		int n = num;
		int rev = 0;
		
		while(n > 0)
		{
			int digit = num % 10;
			
			rev = rev + digit * 10;
			
			n = n / 10;
		}
		return rev;
	}
	
	
	
	
}
