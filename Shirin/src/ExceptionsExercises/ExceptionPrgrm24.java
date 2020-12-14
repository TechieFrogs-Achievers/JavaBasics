package ExceptionsExercises;

import java.util.Scanner;

public class ExceptionPrgrm24 
{
    public static void main(String[] args) 
    {
        System.out.println(" Enter the length");
        Scanner sc = new Scanner(System.in);   //scanner class o
        String str = sc.nextLine();   // Initiallizing string variable
        int length = sc.nextInt();    // array length
        int arr[]= new int[length];    // initializing the array to store the data
        for(int i=0;i<length;i++)
        {
            arr[i] = sc.nextInt();    //Reading input 
        }
        //  using  nested try
        // outer try block
        try    
        {
            str = null;
            System.out.println("the length of a string is:"+str.length());
        // Inner try block
        try
        {
            System.out.println("the array element:"+arr[length+1]);   //prints the incrementedlength
        }
        // catch block
        // it handles exception
        catch(ArithmeticException e)   //inner catch block
        {
            System.out.println("exception :"+e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Exception:"+e);
        }
    }
    catch(NullPointerException Np)
    {
        System.out.println("NullPointerException occurs:"+Np);     
    }
    // finally block if exception occurs or not
    finally
    {
        System.out.println(" Final block excutes ");
    }
    System.out.println("rest of the code  excecute");   //prints the end 
    sc.close();    //scanner close
        
    }
    
}
