package assiginment4;

import java.util.Arrays;


 class Sandb implements Runnable {
	 
	
	public void run()
	
	{
		Thread t1 = new Thread();
		
		
		int[] a={64,32,98,12,2,78,11,35,47,8,6};
	System.out.println("Elements after sort of 1st half:");
		Arrays.sort(a);
		for(int i=0; i<a.length;i++)
		{
		    System.out.print(a[i]+",");
		}
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
	
	


		
	
	
}

 class SandS1 implements Runnable{
	 
	 public void run()
	 {
		 Thread t2 = new Thread();
				 int[] b = {13,46,12,24,1,84,38,43,58,17,77};
				 System.out.println("\nElements after sort in 2nd half:");
				 Arrays.sort(b);
				 for(int i=0;i<b.length;i++)
				 {
					 System.out.print(b[i]+",");
				 }
				 t2.start();
				 try {
					t2.join();
				} catch (InterruptedException e) {
				
					e.printStackTrace();
				}
	 }
	 
 }
 
 public class SandS{
	 public static void main(String args[]) throws Exception
	 {
		 Sandb c= new Sandb();
		 SandS1 d = new SandS1();
		 c.run();
		 d.run();
		 
		 
	 }
	 
 }
