package assiginment4;

import java.util.Arrays;
import java.util.Scanner;

class Sthread {
	
	
	public  int[] sort()
	{
		int[] a = {64,32,98,12,2,78,11,35,47,8,6,13,46,12,24,1,84,38,43,58,17,77};
		System.out.println("Array befor sorting");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(+a[i]+",");
		}
		Arrays.sort(a);
		System.out.println("\n\nArray after sorting");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(+a[i]+",");
		}
		return a;
	}

}

class  Search1 extends Sthread implements Runnable
{
	public void run()
	{
		Thread t1 = new Thread();
		t1.start();
		
		
		
		
		int [] d= super.sort();
		
		System.out.println("\n\nElements in the 1at half are:");
		 
		for(int i=0;i<=d.length/2;i++)
		{
			System.out.print(d[i]+",");
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter the value to search in 1st half");
		int b= sc.nextInt();
           
		
		for(int i=0;i<=d.length/2;i++)
		{
	
                 if(b==d[i])
                    {
	                   System.out.println("Element found at index"+i);
	                   break;
                    }
                 else
                    {
	                      System.out.println("Element not found at index"+i);
                    }

       }
		
	


		
	
		Thread t2 = new Thread();
               t2.start();
           
               

                              int [] e= super.sort();
                            System.out.println("\n\nElements in the 2nd half are:");
                            
                            for(int i=(e.length/2)+1;i<e.length;i++)
                            {
	                               System.out.print(e[i]+",");
                            }
                 
                  System.out.println("\nEnter the value to search in 2nd half");
                    int c= sc.nextInt();
                      
                    
                    for(int i=(e.length/2)+1;i<e.length-1;i++)
                    {
		
                           if(c==e[i])
                                {
	                               System.out.println("Element found at index"+i);
	                               break;
                                 }
                           else
                                 {
	                                System.out.println("Element not found at index"+i);
                                  }
                                     sc.close();
                     }

     }


}



public class Sthreads
{
	public static void main(String[] args)  throws InterruptedException
	{
	Search1 s = new Search1();
	
	
	s.run();
	
	
	}
}