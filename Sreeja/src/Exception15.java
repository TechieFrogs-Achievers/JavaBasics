import java.util.*;
public class Exception15 
{
     public static void main(String[] args) 
     {
        Scanner sc = new Scanner(System.in);            //create scanner class object
        
        //code to be checked for an exception
        try
        { 
            
            int array[] = new int[-3];          //entering the negative size  

            for(int i = 0; i <-3 ; i++)
            {
                array[i] = sc.nextInt();
            }
            sc.close();

        }
        catch(NegativeArraySizeException e)        //to handle the exception
        {
            System.out.println("size is negative - enter positive value");
        }
    }
}
