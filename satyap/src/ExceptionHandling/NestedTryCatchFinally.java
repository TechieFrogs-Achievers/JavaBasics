package ExceptionHandling;
import java.util.*;
public class NestedTryCatchFinally //class for nested try statements 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);//scanner class
        int arr[]=new int[5]; //array notation
        try{ //try block for handling exceptions
            try{ //nested try block
                arr[10]=50; //assigning the 10 index so the array index out of bound exception is occured
            }
            finally{ //finally block which excuted always
                System.out.println("Finally block");
            }
        }
            catch(ArrayIndexOutOfBoundsException i) //catch block for the exception to throw
            {
               System.out.println("Array out of bound Exception"+i);
            }
            //finally{
            //    System.out.println("Finally block always excuted");
            //}
            System.out.println("rest of code"); //rest of code
            sc.close();//scanner close
    }
}
