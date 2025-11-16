package com.demo.queue;

public class MyQueueLinkedList 
{
	Node front;
	Node rear;
	
	class Node
	{
		int data;
		Node next;
		
		public Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	public MyQueueLinkedList()
	{
		this.front = null;
		this.rear = null;
	}
	
	
	public void enQueue(int data)
	{
		Node newNode = new Node(data);
		
		if(isEmpty())
		{
			front = newNode;
		}
		else {
			rear.next = newNode;
		}
		
		rear = newNode;
		System.out.println("EnQueue..."+data);
	}
	
	public int deQueue()
	{
		if(!isEmpty())
		{
			Node temp = front;
			
			front = front.next;
			
			if(front == null)
			{
				rear = null;
			}
			temp.next = null;
			return temp.data;
		}
		else 
		{
			System.out.println("Queue is empty");
			return -1;
		}
			
	}


	public boolean isEmpty() 
	{
		return front ==null && rear == null;
	}
}
