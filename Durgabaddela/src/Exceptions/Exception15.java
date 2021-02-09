package Exceptions;

import java.util.Scanner;

public class Exception15 
{
    public static void main(String[] args)
    {
        try
        { 
            Scanner sc = new Scanner(System.in);//scanner obj creation
            int array[] = new int[-3];//trying to access negative size  

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
            System.out.println("negative size is not valid");
        }
    }
}
