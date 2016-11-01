package stringbuffer;

public class Append {
     
	 public static void main(String args[])
	 {
		 StringBuilder str = new StringBuilder("Vamsi");        // for string type
				 System.out.println("Before append:"+str);
		
		str.append("Tumati");
		System.out.println("After appending:" +str);
		
		StringBuilder str1 = new StringBuilder("123");
		System.out.println("Before append:"+str1);
		
		str1.append(456);
		System.out.println("after append:"+str1);
		
	 }
}
