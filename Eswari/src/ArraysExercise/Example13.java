package ArraysExercise;

import java.util.Scanner;

//class to right rotate the array elements
public class Example13 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);              //scanner class for taking input from user
        int length = scan.nextInt();                        //taking length of an array from user
        int array[] = new int[length];                      //creating array

        for(int i = 0; i < array.length; i++)               //loop for reading array elements from console
        {
            //reading array elements
            array[i] = scan.nextInt();
        }
        System.out.println("Enter how many positions to rotate in left side: ");
        //giving position number for how many positions we want to rotate the arry elements
        int positions = scan.nextInt();             

        int temp;                   //taking temporary variable to swap the elements
        for(int i =0; i < positions; i++)
        {
            temp = array[array.length-1];            //assign the last element to temporary variable
            for(int j = array.length-1; j > 0; j--)
            {
                //change the positions of elements of an array
                array[j] = array[j-1];              
            }
            array[0] =temp;           //the last element is assigned to first position of array
        }
        
        System.out.print("The array elemnets after left rotation is : ");
        //loop is iterated until the array length is there
        for(int i =0 ; i < array.length; i++)
        {
            //printing array elements
            System.out.print(array[i] +" ");
        }
        scan.close();               //scanner close
    }
}

