package ArraysExercise;

import java.util.Scanner;

//class for printing sum of all elements in an array
public class Example12 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);              //scanner class for taking input from user
        int length = scan.nextInt();                        //taking length of an array from user 
        int array[] = new int[length];                  //array creation
        int sum = 0;                        //initially take sum as 0
        for(int i = 0; i < array.length; i++)           //loop for reading array elements
        {
            //reading array elements
            array[i] = scan.nextInt();
        }
        //loop is iterated until the array length is there
        for(int i = 0; i < array.length; i++)
        {
            //condition for sum of all items in array 
            sum = sum + array[i];
        }
        //printing sum 
        System.out.println("The sum of an array is:  " +sum);
        scan.close();               //scanner close
        
    }
    
}
