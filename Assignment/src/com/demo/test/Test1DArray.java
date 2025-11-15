package com.demo.test;

import java.util.Scanner;

import com.demo.arrays1d.My1DArray;

public class Test1DArray {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		
		int [] arr = new int[size];
		
		System.out.println("Enter Array Details");
		My1DArray.acceptData(arr);
		
		System.out.println("Your Array is: ");
		My1DArray.displayData(arr);
		
		int sum = My1DArray.additionOfDigits(arr);
		System.out.println("Addition of digits: "+sum);
		
		int temp [] = My1DArray.findFactorialOfPrime(arr);
		System.out.println("Factorial array is: ");
		My1DArray.displayData(temp);
		
		int maxPrime = My1DArray.findMaxPrime(arr);
		System.out.println("Maximum Prime Number in array is: "+maxPrime);
		
		int temp1[] = My1DArray.copyArray(arr);
		My1DArray.displayData(temp1);
		
		
		

	}

}
