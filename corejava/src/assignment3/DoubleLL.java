

package assignment3;


public class DoubleLL<T> {
	public T data;
	public DoubleLL<T> prev;
	public DoubleLL<T> next;
	
	public DoubleLL(T data) // creating constructor method if list is empty
	{
		prev=null;
		this.data=data;
		next=null;
	}
	
	public DoubleLL(DoubleLL<T> prev, T data, DoubleLL<T> next)
	{
		this.data=data;
		this.prev=prev;        // creating constructor method if data is already in list
		this.next=next;
	}
	
	public T Data()
	{
		return  data;    // creating method to retrieve data in double linked list
	}
	

}
