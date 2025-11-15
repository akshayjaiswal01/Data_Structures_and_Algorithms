package com.demo.linkedlist;

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
			Node temp = head;
			
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
				System.out.println("Position beyond length");
			}
			
		}
	}
	
	
	public void addAfterValue(int value, int data)
	{
		Node newNode = new Node(data);
		
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
			System.out.println("Value not found");
		}
	}
	
	
	
	
	
	public void displayList()
	{
		if(head == null)
		{
			System.out.println("List is empty");
		}
		else
		{
			Node temp = head;
			while(temp != null)
			{
				System.out.print(temp.data+"--->");
				temp = temp.next;
			}
			System.out.println();
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
			Node temp = head;
			
			if(head.data > data)
			{
				newNode.next = head;
				head = newNode;
				return;
			}
			else
			{
			
				while(temp.next !=null && temp.next.data < data)
				{
					temp = temp.next;
				}
				
					newNode.next = temp.next;
					temp.next = newNode;
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
				temp.next = null;
			}
			else
			{
				
				Node prev = null;
				
				for(int i=0; temp != null && i<pos-1; i++)
				{
					prev = temp;
					temp = temp.next;
				}
				
				if(temp != null)
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
				head = temp.next;
				 temp.next = null;
			}
			
			else
			{
				Node prev = null;
				
				while(temp != null && temp.data != value)
				{
					prev = temp;
					temp = temp.next;
				}
				
				if(temp != null)
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
	
	
	public static void main(String[] args) 
	{
		SinglyLinkedList list = new SinglyLinkedList();
		
		list.addNode(10);
		list.addNode(20);
		list.addNode(30);
		list.addNode(40);
		
		list.displayList();
		
//		list.addByPos(3, 25);
//		list.addByPos(6, 45);
//		list.addByPos(1, 5);
//		
//		list.displayList();
//		
//		
//		list.addAfterValue(10, 15);
//		list.displayList();
		
		
		list.addNodeSorted(35);
		
		list.addNodeSorted(5);
		list.displayList();
		
		list.deleteByValue(40);
		
		list.displayList();
	}
}
