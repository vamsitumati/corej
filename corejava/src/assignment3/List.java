package assignment3;

import java.util.Scanner;

public class List<T>  // creating  generic class
{
	DoubleLL<T> head;
	int size;
	
	public List()
	{
		head=null;     // constructor of List class with no data
		size=0;
	}
	
	public void  addFront(T data)
	{
		if(head == null)
		{
			head = new DoubleLL<T>(null,data,null); // creating new list 
			
		}
		else
		{
			DoubleLL<T> dob = new DoubleLL<T>(null,data,head);
			 head.prev=dob;
			head=dob;            // creating new list and making it head
			
		}
		size++;   // increasing size
		
	}
	
	
	public void addLast(T data)
	{
		if(head==null)
		{
			head =  new DoubleLL<T>(null,data,null);
		}
		else
		{
			DoubleLL<T> current = head;
			while(current.next != null)
			{
				current=current.next;
			}
			DoubleLL<T> dob1 = new DoubleLL<T>(current,data,null);
		 current.next = dob1;  // creating list next to head
			
		}
		size++;  // increasing size
	}
	
	
	public void insertAt(T data, int index)  // giving data of generic type T and index number
	{
		if(head == null)
		{
			return;
		}
		if(index <1 || index > size)  // here we can thorw OutoBound exception
		{
			return;
		}
		DoubleLL<T> current = head;
		int i=1;
		while(i < index)
		{
			current = current.next;
			i++;
		}
		if(current.prev == null)
		{
			DoubleLL<T> obj2 = new DoubleLL<T>(null, data, current);
			obj2 = current.prev;
			head = obj2;
		}
		else
		{
			DoubleLL<T> obj2 = new DoubleLL<T>(current.prev,data,current);
			current.prev.next = obj2;
			obj2= current.prev;
			
			
		}
		size++; // increasing size
	}
	
	public void removeFront()  // removing from front of the list
	{
		if(head==null)
		{
			return;
		}
		else{
		
			head = head.next;
			head.prev=null;  
		     size--;          // decreasing the size
		}
	}
	public void removeLast()  // removing from last of the list
	{
		if(head == null)
		{
			return;
		}
		if(head.next==null)
		{
			head = null;
			return;
		}
		DoubleLL<T> current = head;
		while(current.next.next != null)
		{
			current=current.next;
		}
		current.next = null;
		size--;                // decreasing the size
	}
	
	public void removeMid(int index) // removing data at the given index
	{
		if(head == null)
		{
			return;
		}
		if(index <1 || index > size)
		{
			return;
		}
		DoubleLL<T> current = head;
		int i=1;
		while(i < index)
		{
			current = current.next;
			i++;
		}
		if(current.next == null)
		{
			current.prev.next= null;
		}
		else if(current.prev == null)
		{
			current = current.next;
			current.prev = null;
			head = current;
		}
		else
		{
			current.prev.next= current.next;
			current.next.prev = current.prev;
			
		}
		size--;            // decreasing the size
	}
	
	
	
	
	public void searchi()
	{
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the data to search in double linked list");
		
		int s= sc.nextInt();
		@SuppressWarnings("unchecked")
		DoubleLL<Integer> current = (DoubleLL<Integer>) head;
		while(current != null)
		{
			if( current.data == s )
			{
				System.out.println("data found in double linked list");
				
			}
			else
			{
				System.out.println("data not found in double linked list");
			}
			
			current = current.next;
			
		}
		
		
	}
	public void searchc()
	{
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the data to search in double linked list");
		
		char s= sc.next().charAt(0);
		@SuppressWarnings("unchecked")
		DoubleLL<Character> current = (DoubleLL<Character>) head;
		while(current != null)
		{
			if( current.data == s )
			{
				System.out.println("data found in double linked list");
				
			}
			else
			{
				System.out.println("data not found in double linked list");
			}
			
			current = current.next;
			
		}
		
		
	}
	
	public void printa()   // method to print the data in the List
	{
		DoubleLL<T> current = head;
		while(current != null)
		{
			System.out.println(current.Data()); // calling method "Data" from DoubleLL class
			current = current.next;
		}
		
	}
	
	public int size()         // method to get the size  of the list
	{
		System.out.println("The size of a list is:" +size);
		return size;
	}
	
}
