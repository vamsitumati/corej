package assiginment4;

import java.util.Scanner;

public class Wood{
    public static int  squares(){          // static method 
        int noofsquares = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the amount u have in $:"); // entering the amount using scanner
        int num = sc.nextInt();
        while(num> 0)
        {
            int square = (int)Math.sqrt(num); // square root of a non perfect square will return nearby int value
            noofsquares++;                      // Increment
            num=num -square*square;    // if num is zero return normally, if greater than zero, again goes back to while looop
        }  
        sc.close();
        System.out.println("no of wood blocks you will get are:"+"\n"+noofsquares);
        return noofsquares;
    }
    
    
    public static void main(String[] args)
    {
    	squares();
    }
}