package assiginment4;

import java.util.Arrays;
import java.util.Scanner;

public class Sarray {
	
	static int[] a = {64,32,98,12,2,78,11,35,47,8,6,13,46,12,24,1,84,38,43,58,17,77};
	
	public static void sort()
	{
		System.out.println("Array before sorting");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+",");
		}
		
		System.out.println("\n\nArray after sorting:");
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
	
			System.out.print(a[i]+",");
			
		}
		
		
		
		
		System.out.println("\n\nElements in the 1at half are:");
				for(int i=0;i<=a.length/2;i++)
				{
					System.out.print(a[i]+",");
				}
		
				Scanner sc = new Scanner(System.in);
				System.out.println("\nEnter the value to search in 1st half");
				int b= sc.nextInt();
		for(int i=0;i<=a.length/2;i++)
		{
			
		if(b==a[i])
		{
			System.out.println("Element found at index"+i);
			break;
		}
		else
		{
			System.out.println("Element not found at index"+i);
		}
		
		}
		System.out.println("\n\nElements in the 2nd half are:");
		for(int i=(a.length/2)+1;i<a.length;i++)
		{
			System.out.print(a[i]+",");
		}
		
		System.out.println("\nEnter the value to search in 2nd half");
		 int c= sc.nextInt();
		for(int i=(a.length/2)+1;i<a.length-1;i++)
		{
				
		if(c==a[i])
		{
			System.out.println("Element found at index"+i);
			break;
		}
		else{
			System.out.println("Element not found at index"+i);
		}
			sc.close();
			
		}
	}
	public static void main(String args[])
	{
		sort();
	}
}
	
	
	
	
