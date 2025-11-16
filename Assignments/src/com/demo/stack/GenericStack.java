package com.demo.stack;

public class GenericStack<T> 
{
	private Object [] arr;
	
	private int top;
	
	public GenericStack()
	{
		this.arr = new Object[10];
		this.top = -1;
	}
	
	public GenericStack(int size)
	{
		this.arr = new Object[size];
		this.top = -1;
	}
	
	public void push(T data)
	{
		if(!isFull())
		{
			top++;
			arr[top] = data;
			System.out.println("Push..."+data);
		}
		else {
			System.out.println("Stack is full");
		}
	}
	
	public T pop()
	{
		if(!isEmpty())
		{
			T data = (T) arr[top];
			top--;
			
			return data;
		}
		else
		{
			System.out.println("Stack is empty");
			return null;
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
	
}
