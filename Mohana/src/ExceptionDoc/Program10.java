package ExceptionDoc;

import java.util.Scanner;

public class Program10 
{
    public static void main(String[] args) 
    {  
        Scanner sc = new Scanner(System.in);

         //try and catch blocks to handle exceptions
        try{  

            int a = sc.nextInt();
            int b = sc.nextInt();

            int c = a/b;

            System.out.println(c);

        } 

        catch(ArithmeticException e) //handles arthematic exception
        {
            System.out.println(e);
        }    

        catch(NullPointerException e) //handles null poinyer exception
        {
            System.out.println(e);
        }

        catch(Exception e) //handles any kind of exception
        {
            System.out.println("Input Mismatch");
        }

        sc.close();
    }
    
}
