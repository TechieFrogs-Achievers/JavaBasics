package ArraysExercise;

import java.util.Scanner;

//class to sort array elements in ascending order
public class Example14 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);          //scanner class for taking input from user
        int length = scan.nextInt();                //taking length of an array from user
        int array[] = new int[length];              //creating array
        int temp = 0;                               //temporary variable for swapping 
        //loop for reading array elements from console
        for(int i = 0; i < array.length; i++)           
        {
            //reading array elements 
            array[i] = scan.nextInt();
        }
        //loop for taking first element and loop iterates until array length is there
        for(int i= 0; i < array.length; i++)
        {
            //loop for taking second element
            for(int j= i +1; j < array.length; j++)
            {
                //checking first element with second element 
                if(array[i] > array[j])
                {
                    //swapping first element with next element 
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.print("Array in ascending order is : " );
        //loop for printing array elements in ascending order
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] +"  ");
        }
        scan.close();               //scanner close
        
    }
    
}
