package ArraysExercise;

import java.util.Scanner;

public class Example1 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);                      //scanner clss for taking input from user
        int length = scan.nextInt();                            //taking array length
        int array[] = new int[length];                          //initializing array with size
        int array1[] = new int[length];                         //initializing second array with size

        //loop is iterate until array length is there
        for(int i = 0; i < array.length; i++)           
        {
            //array elements reading
            array[i] = scan.nextInt();
        }
        //coping first array elements to second array elements
        //array1 = array.clone();

        array1 = array;             //without using clone() coping one array elements to another array

        //loop for printing array 2 elements in console
        for(int i = 0; i< array1.length;i++)
        {
            //printing array elemnets
            System.out.print(array1[i] +" " );
        }
        scan.close();                   //scanner close

        
    }
    
}
