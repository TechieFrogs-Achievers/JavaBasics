package ExceptionDoc;

import java.util.Scanner;

public class Program14 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); //scsnner obj creation 
       

        int array[] = new int[6];//initializing array 

        //try and catch blocks to handle exceptions

        try
        {  

            for(int i =0 ;i < 6; i++)
            {
                array[i] =sc.nextInt();
            } 

            System.out.println(array[7]); //trying to access out of range value
            //it throws an exception

        }   
        //catch block to handle an exception

        catch(ArrayIndexOutOfBoundsException aie)
        {
            System.out.println("Given index is out of range"); 
        }
        sc.close();
        
    }
    
}
