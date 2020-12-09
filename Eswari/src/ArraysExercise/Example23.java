package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

//classto sort the array elements
public class Example23 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);                  //scanner class for taking input from user
        int length = scan.nextInt();                        //taking length of an array from user
        int array[] = new int[length];                      //array creation
        //loop for reading array elements from console
        for(int i = 0;i < array.length; i++)
        {
            //reading array elements
            array[i] = scan.nextInt();
        }
        //arrays.sort() method is used for sorting our array elements(its only sort in ascending order)
        Arrays.sort(array);
        
        System.out.println("The sorted elements in an array : " );
        //loop is iterated until the array length is there
        for(int i = 0; i < array.length;i++)
        {
            //printing elements
            System.out.print(array[i] +" ");
        }
        scan.close();           //scanner close
        
    }
    
}
