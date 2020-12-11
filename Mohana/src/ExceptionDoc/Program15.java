package ExceptionDoc;

import java.util.Scanner;

public class Program15 
{
    public static void main(String[] args)
    {  
        //try and catch blocks to handle exceptions
        try
        { 
            Scanner sc = new Scanner(System.in);//scanner obj creation
            int array[] = new int[-3];//trying to access ngative size  

            //it throws an exception
            
            for(int i = 0; i <-3 ; i++)
            {
                array[i] = sc.nextInt();
            }
            sc.close();

        }
        
        //catch block to handle that exception

        catch(NegativeArraySizeException na) //negative size exception handler
        {
            System.out.println("Please provide an positive size");
        } 


       

    }
    
}
