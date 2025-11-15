package com.demo.sorting;

public class MergeSort 
{
	public static void mergeSort(int arr[], int start, int end)
	{
		if(start < end)
		{
			int mid = (start+end)/2;
			
			mergeSort(arr, start, mid);
			
			mergeSort(arr, mid+1, end);
			
			merge(arr, start, mid, end);
		}
	}
	
	public static void merge(int [] arr, int start, int mid, int end)
	{
		int n1 = (mid-start)+1;
		
		int n2 = end - mid;
		
		int [] leftArray = new int [n1];
		
		int [] rightArray = new int [n2];
		
		for(int i=0; i<leftArray.length; i++)
		{
			leftArray[i] = arr[start + i];
		}
		
		for(int j=0; j<rightArray.length; j++)
		{
			rightArray[j] = arr[mid+1+j];
		}
		
		int i=0; int j=0; int k = start;
		while(i < j)
		{
			if(leftArray[i] < rightArray[j])
			{
				arr[k] = leftArray[i];
				i++;
				k++;
			}
			else
			{
				arr[k] = rightArray[j];
				j++;
				k++;
			}
		}
		
		while(i<n1)
		{
			arr[k] = leftArray[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			arr[k] = rightArray[j];
			j++;
			k++;
		}
		
	}
}
