package ArraysExercise;

import java.util.Scanner;

//class for printing elements in ana array
public class Example5 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);              //scanner class for taking input from user
        int length = scan.nextInt();                        //taking length of an array
        int array[] = new int[length];                      //creating array
        System.err.print("The elements are: ");
        //loop for reading array elements
        for(int i= 0; i < length; i++)              
        {
            array[i] = scan.nextInt();
        }
        System.out.print("The elements of an array are:  " );
        //loop for printing array elements
        for(int i= 0; i < array.length; i++)
        {
            //printing array elements in console
            System.out.print(array[i] +"  ");
        }
        scan.close();                   //scanner close
        
    }
    
}
