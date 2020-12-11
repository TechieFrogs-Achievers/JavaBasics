package ArraysExercise;

import java.util.Scanner;

//class to print even and odd numbers in an array
public class Example22 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);              //scanner class for taking input from user
        int length = scan.nextInt();                    //taking length of an array from user
        int array[] = new int[length];                  //array creation
        for(int i = 0; i < array.length; i++)           //loop for reading array elements
        {
            //array elements reading
            array[i] = scan.nextInt();
        }
        System.out.println("The even numbers in an array is : " );
        //loop is iterated until array elements are there
        for(int i = 0; i < array.length; i++)
        {
            //if condition for checking even number
            if(array[i] % 2 == 0)
            {
                //printing even numbers
                System.out.println(+array[i]);
            }
            // else 
            // {
            //     System.out.println("The odd numbers in an array : " +array[i]);
            // }
        }
        System.out.println("The odd numbers in an array is : " );
        //loop is iterated until array elements are there
        for(int i = 0; i < array.length; i++)
        {
            //if condition for checking odd number is not
            if(array[i] % 2 != 0)
            {
                //printing odd numbers
                System.out.println(+array[i]);
            }
        }
        scan.close();               //scanner close
        
    }
    
}
