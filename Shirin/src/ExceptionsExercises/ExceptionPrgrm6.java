package ExceptionsExercises;
import java.util.*;

public class ExceptionPrgrm6 
{
    public static void main(String[] args) 
    {
        System.out.println(" Enter the length");
        Scanner sc = new Scanner(System.in);   //scanner class 
        String str = sc.nextLine();   //string variable
        int length = sc.nextInt();     // array length
        int arr[]= new int[length];    // Initializing  array for storing the data
        for(int i=0;i<length;i++)
        {
            arr[i] = sc.nextInt();    //reading input elements
        }
        // using nested 
        //  outside try block 
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
        catch(ArithmeticException e)  
        {
            System.out.println("ArithmeticExceptionexception occurs :"+e);
        }
        catch(ArrayIndexOutOfBoundsException a)
        {
            System.out.println("ArrayIndexOutOfBoundsExceptionException occurs:"+a);
        }
    }
    catch(NullPointerException p)
    {
        System.out.println("Exception is:"+p);      
    }
    System.out.println("rest of the code Excecute");  
    sc.close();    //scanner class close
        
    }
    
}
