package com.demo.queue;

public class CircularQueue 
{
	private int [] arr;
	private int front;
	private int rear;
	private int size;
	public int count = 0;
	
	public CircularQueue()
	{
		this.arr = new int[10];
		this.front = -1;
		this.rear = -1;
		this.size = 0;
	}
	
	public CircularQueue(int size)
	{
		this.arr = new int[size];
		this.front = -1;
		this.rear = -1;
		this.size = 0;
	}
	
	public void enQueue(int data)
	{
		if(isFull())
		{
			deQueue();
			count++;
			
		}
		
		if(isEmpty())
		{
			front = 0;
			rear = 0;
		}
		else {
			rear = (rear+1) % arr.length;
		}
		
		arr[rear] = data;
		size++;
		
	}
	
	public int deQueue()
	{
		if(isEmpty())
		{
			return -1;
		}
		
		int data = arr[front];
		
		if(front == rear)
		{
			front = -1;
			rear = -1;
		}
		else 
		{
			front = (front+1) % arr.length;
		}
		
		size--;
		
		return data;
	}
	

	public boolean isEmpty() 
	{
		return front == -1;
	}

	public boolean isFull() 
	{
		return size == arr.length;
	}

	
}
