package com.demo.linkedlist;

public class DoublyLinkedList 
{
	Node head;
	
	class Node
	{
		int data;
		Node prev;
		Node next;
		
		public Node(int data)
		{
			this.data = data;
			this.prev = null;
			this.next =  null;
		}
	}
	
	public DoublyLinkedList()
	{
		head = null;
	}
	
	
	public void addNode(int data)
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
			
			newNode.prev = temp;
			temp.next = newNode;
			
		}
			 
		
	}
	
	
	public void addByPos(int pos, int data)
	{
		Node newNode = new Node(data);

		if(pos == 1)
		{
			newNode.next = head;
			
			if(head != null)
			{
				head.prev = newNode;
			}
			
			head = newNode;
			
		}
		else
		{
			Node temp = head;
			
			for(int i=0; temp != null && i<pos-2; i++)
			{
				temp = temp.next;
			}
			
			if(temp != null)
			{
				newNode.next = temp.next;
				newNode.prev = temp;
				temp.next = newNode;
				
				if(newNode.next != null)
				{
					newNode.next.prev = newNode;
				}
			}
			else
			{
				System.out.println("Position not found");
			}
		}
	}
	
	public void addAfterValue(int value, int data)
	{
		Node newNode = new Node(data);
		
		if(head == null)
		{
			System.out.println("List is empty");
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
				newNode.prev = temp;
				temp.next = newNode;
				
				if(newNode.next != null)
				{
					newNode.next.prev = newNode;
				}
			}
			else
			{
				System.out.println("Number not found");
			}
		}
	}
	
	
	public void addNodeSorted(int data)
	{
		Node newNode = new Node(data);
		
		if(head == null)
		{
			head = newNode;
		}
		else
		{
			
			if(head.data > data)
			{
				head.prev = newNode;
				newNode.next = head;
				
				head = newNode;
				
			}
			else
			{
				Node temp = head;
				
				while(temp != null && temp.next.data < data)
				{
					temp = temp.next;
				}
				
				if(temp != null)
				{
					newNode.next = temp.next;
					newNode.prev = temp;
					temp.next = newNode;
					
					if(newNode.next != null)
					{
						newNode.next.prev = newNode;
					}
				}
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
				head = temp.next;
				head.prev = null;
			}
			else
			{
				for(int i=0; temp != null && i<pos-1; i++)
				{
					temp = temp.next;
				}
				
				if(temp != null)
				{
					temp.prev.next = temp.next;
					
					if(temp.next != null)
					{
						temp.next.prev = temp.prev;
						temp.next = null;
					}
					
					temp.prev = null;	
				}
				else
				{
					System.out.println("Position beyond the limit");
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
				head = temp.next;
				head.prev = null;
			}
			else
			{
				while(temp != null && temp.data != value)
				{
					temp = temp.next;
				}
				
				if(temp != null)
				{
					temp.prev.next = temp.next;
					
					if(temp.next != null)
					{
						temp.next.prev = temp.prev;
						temp.next = null;
					}
					temp.prev = null;
				}
				else
				{
					System.out.println("Number not found");
				}
			}
		}
	}
	
	
	
	public void display()
	{
		Node temp = head;
		
		while(temp != null)
		{
			System.out.print(temp.data+"--->");
			temp = temp.next;
		}
		
		System.out.println();
	}
	
	
	
	public static void main(String[] args) 
	{
		DoublyLinkedList list = new DoublyLinkedList();
		
		list.addNode(10);
		list.addNode(20);
		list.addNode(30);
		list.addNode(40);
		list.addNode(50);
		
		
		list.addByPos(1, 5);
		list.addByPos(4, 25);
		list.addByPos(7, 60);
		
		list.addAfterValue(50, 55);
		list.addAfterValue(30, 35);
		
		list.addNodeSorted(1);
		
		list.display();
		
		list.deleteByValue(1);
		list.display();
	}
	
}
