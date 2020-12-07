package ScannerClass;
import java.util.*;
public class ValidationPart 
{
    public static void main(String[] args) 
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter integer number:");
      //check int values
       while(!sc.hasNextInt())
        {
            System.err.println("Error:This is not valid input, Please enter valid input");
            sc.next();//moves to the next token 
        }
        int n = sc.nextInt();
        System.out.println("the integer number is ="+n);

       //check float values
       System.out.println("Enter Float number:");
       while(!sc.hasNextFloat())
       {
           System.err.println("Error:This is not valid input, Please enter valid input");
           sc.next();//moves to the next token 
       }
       float f = sc.nextFloat();
       System.out.println("the float number is ="+f);

       //check double values
       System.out.println("Enter Double number:");
       while(!sc.hasNextDouble())
       {
          System.err.println("Error:This is not valid input, Please enter valid input");
          sc.next();//moves to the next token 
       }
       double d = sc.nextDouble();
       System.out.println("the Double number is ="+d);

       //check long values
       System.out.println("Enter Long number:");
       while(!sc.hasNextLong())
       {
          System.err.println("Error:This is not valid input, Please enter valid input");
          sc.next();//moves to the next token 
       }
       long l = sc.nextLong();
       System.out.println("the Long number is ="+l);

        sc.close();
    }
}
