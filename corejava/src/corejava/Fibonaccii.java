package corejava;


public class Fibonaccii {
	int init =0;
	int next=1;
	int prev;
	public void meth(){

	System.out.println("The numbers in Fibonacci series are:");
	System.out.print(init+","+next+",");
	for(int i=1;i<10;i++)
	{
		
		 
		
		prev= next+init;
		init = next;
		next = prev;
		
		System.out.print(next+",");
	}
	}
	
	public static void main(String args[])
	{
		Fibonacci f = new Fibonacci();
		f.meth();
		
	}

}
