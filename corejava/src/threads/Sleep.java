package threads;

public class Sleep {
	
	public static void main(String args[]) throws  InterruptedException
	{
		int[] a = {4,6,2,9,10};
		isAlive();
		
		//Thread.sleep(4000);
		for(int i=0;i<a.length;i++)
		{
			Thread.sleep(4000);
			System.out.print(a[i]+",");
			
		}
		
	}

	private static boolean isAlive() {
		return true;
		// TODO Auto-generated method stub
		
	}

}
