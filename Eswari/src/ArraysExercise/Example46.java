package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

//class to concatenate two arrays
public class Example46 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);                  //scanner class for taking input from user
        int length1 = scan.nextInt();                           //taking array1 length from user
        int length2 = scan.nextInt();                           //taking array2 length from user
        int array1[] = new int[length1];                        //creating arrays
        int array2[] = new int[length2];
        System.out.println("Enter the first array elements:");
        //loop for reading array1 elements from console 
        for(int i = 0; i < array1.length; i++)
        {
            //reading array elements
            array1[i] = scan.nextInt();
        }
        System.out.println("Enter the second array elements:");
        //loop for reading array2 elements from console
        for(int i = 0; i < array2.length; i++)
        {
            //reading array elements
            array2[i] = scan.nextInt();
        }
        //creating array3 for copying array1 and array2 elements
        int array3[] = new int[array1.length + array2.length];
        // for(int i= 0; i < array3.length; i++)
        // {
            
        // }
        //arraycopy method is used to copy array elements to another array
        System.arraycopy(array1, 0, array3, 0, array1.length);
        System.arraycopy(array2, 0, array3, array1.length, array2.length);

        System.out.println(Arrays.toString(array3));            //printing array3 elements
        scan.close();               //scanner closes
        
    }
    
}
