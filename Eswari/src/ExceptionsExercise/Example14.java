package ExceptionsExercise;

import java.util.Scanner;

//class to handle ArrayIndexOutOfBounds
public class Example14 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);              //scanner class for taking input from user
        int length = scan.nextInt();                        //taking length for an array from user
        int array[] = new int[length];                      //creating array
        //loop for reading array elements from console
        for(int i = 0; i < array.length; i++)
        {
            //reading array elements
            array[i] = scan.nextInt();
        }
        //try block for taking exceptions in program
        try
        {
            //the exception occur because trying to print more than length of the index of an array
            System.out.println(array[length + 1]);              
        }
        //catching the exceptions that occurs in try block and handles in this block
        catch(ArrayIndexOutOfBoundsException a)
        {
            System.out.println(a);
        }
        System.out.println("End of program");
        scan.close();               //scanner close
        
    }
    
}
