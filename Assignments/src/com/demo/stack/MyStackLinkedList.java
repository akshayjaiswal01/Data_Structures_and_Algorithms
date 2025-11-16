package com.demo.stack;

public class MyStackLinkedList 
{
	Node head;
	
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
	
	public MyStackLinkedList()
	{
		this.head = null;
	}
	
	public void push(int data)
	{
		Node newNode = new Node(data);
		
		if(head == null)
		{
			head = newNode;
			System.out.println("Pushed..."+data);
		}
		else 
		{
			newNode.next = head;
			head =newNode;
			System.out.println("Pushed..."+data);
		}
	}
	
	public int pop()
	{
		if(!isEmpty())
		{
			int num = head.data;
			head = head.next;
			return num;
		}
		else {
			return -1;
		}
	}
	
	

	public boolean isEmpty() 
	{
		return head ==null;
	}
}
