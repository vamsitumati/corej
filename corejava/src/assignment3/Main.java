
package assignment3;

public  class Main<T> {
	public static void main(String args[])
	{
		List<Integer>  a = new List<Integer>();  // creating an object for interger data type
		List<Character> c = new List<Character>(); // creating an object for character data type
	    
		System.out.println("Adding to  the front of the list:\n");
		a.addFront(5);
		a.addFront(8);
		a.addFront(10);    // Adding to front
		a.printa();
		a.size();
		
		System.out.println("Adding at the last of the list:\n");
		
		a.addLast(20);
		a.addLast(30);                   // Adding to last
		a.addLast(40);
		a.printa();
		a.size();
		
		System.out.println("Adding at index 4, data 23:\n");
		
		a.insertAt(23, 4);                 // inserting at index 4
		a.printa();
		a.size();                        
		a.searchi();                        //Searching the double linked list for integer type
		
		System.out.println("Removing at the front:\n");
		a.removeFront();
		a.printa();         // Removing from front
		a.size();
		
		System.out.println("Removing at the last:\n");
		a.removeLast();
		a.printa();      // Removing from lat
		a.size();
		
		System.out.println("Removing in the middle at index 3:\n");
		a.removeMid(3);                                                    // Removing at index 3
		a.printa();
		a.size();
		
		
		System.out.println("FOR CHARACTER DOUBLE LINKED LIST\n\n");     // For character type
		  
		
		
		System.out.println("Adding to  the front of the list:\n");
		c.addFront('a');
		c.addFront('b');                                                 // Adding to front
		c.addFront('c');
		c.printa();  
		c.size();
		
		System.out.println("Adding at the last of the list:\n");
		
		c.addLast('d');
		c.addLast('e');                                               // Adding to last
		c.addLast('f');
		c.printa();
		c.size();
		
		System.out.println("Adding at index 4, character f:\n");
		
		c.insertAt('f', 4);
		c.printa();                                                    // inserting at index 4
		c.size();
		System.out.println("Removing at the front:\n");
		c.removeFront();                                              //Removing from front
		c.printa();
		c.size();
		
		System.out.println("Removing at the last:\n");
		c.removeLast();                                            // Removing from last
		c.printa();
		c.size();
		
		
		System.out.println("Removing in the middle at index 3:\n");
		c.removeMid(3);                                                    //Removing at index 3
		c.printa();
		c.size();
		c.searchc();                                                     //Searching the double linked list for character type
		
		
		
		
		
		
		
		
		
	}

}
