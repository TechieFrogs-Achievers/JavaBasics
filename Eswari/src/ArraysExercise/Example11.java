package ArraysExercise;

import java.util.Scanner;

//class for printing the number of elements in ana array
public class Example11 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);              //scanner class for taking input from user
        int length = scan.nextInt();                        //taking length of an array
        int array[] = new int[length];                      //array creation
        //loop for reading array elements
        for(int i = 0; i< array.length; i++)       
        {
            //reading array elements
            array[i] = scan.nextInt();
        } 
        //printing number of elements in an array
        System.out.println("The length of an array is:  " +array.length);
        // System.out.println(length);
        scan.close();
    }   
}
