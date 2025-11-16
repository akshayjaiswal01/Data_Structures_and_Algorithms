package com.demo.list;

public class SinglyLinkedList 
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
	
	public SinglyLinkedList()
	{
		this.head = null;
	}
	
	
	public void addAtEnd(int data)
	{
		Node newNode = new Node(data);
		
		if(head == null)
		{
			head = newNode;
			return;
		}
		else 
		{
			Node temp = head;
			
			while(temp.next != null)
			{
				temp = temp.next;
			}
			
			temp.next = newNode;
		}
	}
	
	public void addByPos(int pos, int data)
	{
		Node newNode = new Node(data);
		
		if(pos == 1)
		{
			newNode.next = head;
			head = newNode;
		}
		else 
		{
			Node temp = newNode;
			
			for(int i=0; temp != null && i<pos-2; i++)
			{
				temp = temp.next;
			}
			
			if(temp != null)
			{
				newNode.next = temp.next;
				temp.next = newNode;	
			}
			else 
			{
				System.out.println("Position beyond limit...");
			}
		}
	}
	
	public void addAfterValue(int value, int data)
	{
		Node newNode = new Node(data);
		
		if(head.data == value)
		{
			newNode.next = head.next;
			head.next = newNode;
		}
		else 
		{
			Node temp = head;
			
			while(temp != null && temp.data != value)
			{
				temp = temp.next;
			}
			
			if(temp != null)
			{
				newNode.next = temp.next;
				temp.next = newNode;
			}
			else 
			{
				System.out.println("Number Not found...");
			}
		}
		
	}
	
	public void addSorted(int data)
	{
		Node newNode = new Node(data);
		
		if(head == null)
		{
			head =newNode;
		}
		else 
		{
			Node temp = head;
			
			if(head.data > data)
			{
				newNode.next = head;
				head = newNode;
			}
			else 
			{
				while(temp.next != null && temp.next.data > data)
				{
					temp = temp.next;
				}
				
				newNode.next = temp.next;
				temp.next = newNode;
				
				
			}
		}
		
	}
	
}
