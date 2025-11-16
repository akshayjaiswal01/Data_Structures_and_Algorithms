package com.demo.stack;

public class MyStack 
{
	private int [] arr;
	
	private int top;
	
	public MyStack()
	{
		this.arr = new int[10];
		this.top = -1;
	}
	
	public MyStack(int size)
	{
		this.arr = new int[size];
		this.top = -1;
	}
	
	public void push(int num)
	{
		if(!isFull())
		{
			top++;
			arr[top] = num;
			System.out.println("Pushed..."+num);
		}
		else {
			System.out.println("Stack is full!!!");
		}
	}
	
	public int pop()
	{
		if(!isEmpty())
		{
			int num = arr[top];
			top--;
			System.out.println("Pop...");
			return num;
		}
		else {
			System.out.println("Stack is empty!!!");
			return -1;
		}
	}
	
	public int peek()
	{
		if(!isEmpty())
		{
			return arr[top];
		}
		else 
		{
			return -1;
		}
	}

	public boolean isEmpty() 
	{
		return top == -1;
	}

	public boolean isFull() 
	{
		return top == arr.length-1;
	}

//	public boolean checkPalindrome(String string) 
//	{
//		int length = string.length();
//		
//		
//		return false;
//	}
}
