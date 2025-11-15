package com.demo.linkedlist;

import com.demo.linkedlist.DoublyLinkedList.Node;

public class SinglyCircularLinkedList 
{
	Node head;
	
	class Node
	{
		int data;
		Node next;
		
		public Node(int data)
		{
			this.data=data;
			this.next=null;
			
		}
	}
	
	public SinglyCircularLinkedList()
	{
		head=null;
	}
	
	public void addNode(int data)
	{
		Node newNode = new Node(data);
		
		if(head==null)
		{
			head=newNode;
			newNode.next=head;
			
		}
		else
		{
			Node temp=head;
			
			while(temp.next!=head)
			{
				temp=temp.next;
			}
		
			temp.next=newNode;
			newNode.next=head;
		}
	}
	
	public void addByPos(int pos, int data)
	{
		Node newNode = new Node(data);
		
		if(pos == 1)
		{
			Node temp = head;
			
			while(temp.next != head)
			{
				temp = temp.next;
			}
			
			newNode.next = head;
			head = newNode;
			temp.next = head;
		}
		else
		{
			Node temp = head;
			int i=0;
			
			for(; temp.next != head && i<pos-2; i++)
			{
				temp = temp.next;
			}
			
			if(i == pos-2)
			{
				newNode.next = temp.next;
				temp.next = newNode;
			}
			else
			{
				System.out.println("Position beyond the limit");
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
			
			do
			{
				temp = temp.next;
			}
			while(temp != head && temp.data != value);
			
			if(temp != head)
			{
				newNode.next = temp.next;
				temp.next = newNode;
			}
			else
			{
				System.out.println("Number not found");
			}
		}
		
	}
	
	public void deleteByPos(int pos)
	{
		if(head == null)
		{
			System.out.println("List is empty");
		}
		else
		{
			Node temp = head;
			if(pos == 1)
			{
				Node tail = head;
				while(tail.next != head)
				{
					tail = tail.next;
				}
				
				if(tail == head)
				{
					head = null;
				}
				else
				{
					head = head.next;
					temp.next = null;
					tail.next = head;
				}
			}
			else
			{
				Node prev = null;
				
				int i=0;
				for(; temp.next != head && i<pos-1; i++)
				{
					prev = temp;
					temp = temp.next;
				}
				
				if(i == pos-1)
				{
					prev.next = temp.next;
					temp.next = null;
				}
				else
				{
					System.out.println("Position beyond limit");
				}
			}
		}
	}
	
	public void deleteByValue(int value)
	{
		if(head == null)
		{
			System.out.println("List is empty");
		}
		else
		{
			Node temp = head;
			
			if(head.data == value)
			{
				Node tail = head;
				while(tail.next != head)
				{
					tail = tail.next;
				}
				
				if(tail == head)
				{
					head = null;
				}
				else
				{
				
					head = head.next;
					temp.next = null;
					tail.next = head;
				}
			}
			
			else
			{
				Node prev = null;
				
				int i=0;
				
				for(; temp.next != head && temp.data != value; i++)
				{
					prev = temp;
					temp = temp.next;
				}
				
				if(temp.data == value)
				{
					prev.next = temp.next;
					temp.next = null;
				}
				else
				{
					System.out.println("Value not found");
				}
			}
		}
	}
	
	
	public void display()
	{
		
		if(head == null)
		{
			System.out.println("List is empty");
		}
		
		Node temp = head;
		
		do
		{
			System.out.print(temp.data+"--->");
			temp = temp.next;
		}
		while(temp != head);
		
		System.out.println("head");
	}
	
	public static void main(String[] args) 
	{
		SinglyCircularLinkedList clist = new SinglyCircularLinkedList();
		
		clist.addNode(10);
		clist.addNode(20);
		clist.addNode(30);
		clist.addNode(40);
		clist.addNode(50);
		clist.addNode(60);
		
		clist.display();
	}
}
