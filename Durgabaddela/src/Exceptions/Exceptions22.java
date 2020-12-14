package Exceptions;

public class Exceptions22
 {
    public static void main(String[] args)
     {
        int a =20 , b =0;
        //multiple try and catch blocks

        //outer  try block
        try 
        { 
            System.out.println("first try  block"); 

            int c = a/b; 

            System.out.println(c); 
        }
        catch(ArithmeticException ae)
        {
           System.out.println("Divide by zero error");
        } 

        //another  try block 
        try
        { 
            System.out.println("another try block");
           int array[] = new int[3];

           array[5] = 24;
           System.out.println(array[5]);

        } 

        catch(ArrayIndexOutOfBoundsException aie)
        {
            System.out.println("array index range exceeds");
        } 

        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
