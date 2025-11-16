package com.demo.queue;

public class MyQueueArray 
{
	private int [] arr;
	private int front;
	private int rear;
	private int size;
	
	public MyQueueArray()
	{
		this.arr = new int[10];
		this.front = 0;
		this.rear = -1;
		this.size = 0;
	}
	
	public MyQueueArray(int size)
	{
		this.arr = new int[size];
		this.front = 0;
		this.rear = -1;
		this.size = 0;
	}
	
	public void enQueue(int num)
	{
		if(!isFull())
		{
			rear = (rear+1) % arr.length;
			arr[rear] = num;
			size++;
			System.out.println("Enqueue..."+num);
		}
		else 
		{
			System.out.println("Queue is full");
		}
	}
	
	public int deQueue()
	{
		if(!isEmpty())
		{
			int num = arr[front];
			front = (front+1) % arr.length;
			size--;
			return num;
		}
		else {
			return -1;
		}
	}

	public boolean isEmpty() 
	{
		
		return size == 0;
	}

	public boolean isFull() 
	{
		return size == arr.length;
	}
	
	
}
