package ExceptionsExercise;

import java.util.Scanner;

//class to handle NegativeArraySizeException
public class Example15 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        // int length = scan.nextInt();
        // int array[] = new int[length];
        // for(int i = 0; i < array.length; i++)
        // {
        //     array[i] = scan.nextInt();
        // }
        // int size = -5;
        // try
        // {
        //     int array[] = new int[size];
            // if(length < 0)
            // {
            //     int array[] = new int[length];
            //     // throw new NegativeArraySizeException("Array can not have negative length");
            // }
        // }
        // catch(NegativeArraySizeException na)
        // {
            // for(int i = 0; i < array.length; i++)
            // {
            //     System.out.print(array[i] +" ");
            // }
            
        //}
        // for(int i = 0; i < array.length; i++)
        // {
        //     System.out.print(array[i] +" ");
        // }
        //System.out.println("End of program");
        // scan.close();
        

        //ststic way of handling
        int length = scan.nextInt();            //taking length of an array from user
        try
        {
            //if we give size as negative number then it give exception
            int array[] = new int[length];              
        }
        //handling exception occurs in try block
        catch(NegativeArraySizeException na)
        {
            System.out.println("Can not give array size as negative");
        }
        System.out.println("End of program");
        scan.close();           //scanner close
    }
    
}
