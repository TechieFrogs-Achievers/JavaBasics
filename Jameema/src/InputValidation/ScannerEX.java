package InputValidation;
import java.util.Scanner;

public class ScannerEX 
{
    public static void main(String[] args)
     {
         Scanner sc = new Scanner(System.in); //scanner metid
         System.out.println("enter int values");

         int a=sc.nextInt(); //input value
         System.out.println("the int value    :" +a); //printing thje integer

         System.out.println("enter float values");
         float b=sc.nextFloat();
         System.out.println(" the float value    :" +b);

         System.out.println("enter byte values");
         byte c=sc.nextByte();
         System.out.println(" the byte value    :" +c);

         System.out.println("enter char values");
         char d=sc.next().charAt(0); //input char value
         System.out.println(" the char value    :" +d);

         System.out.println("enter long values");
         long e=sc.nextLong();
         System.out.println(" the long value    :" +e);

         System.out.println("enter double values");
         double f=sc.nextDouble();
         System.out.println(" the double value    :" +f);
         sc.close();
        
    }
    
}
