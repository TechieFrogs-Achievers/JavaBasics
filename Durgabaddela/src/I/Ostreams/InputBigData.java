package I.Ostreams;

import java.math.BigInteger;
import java.util.Scanner;

public class InputBigData 
{
    public static void main(String[] args)
    {   
          Scanner sc = new Scanner(System.in);  
          System.out.print("Enter Value of a: ");  
          BigInteger a = sc.nextBigInteger();//reads the big integer 
          System.out.println(a);  
          sc.close();  
            
    }
}
