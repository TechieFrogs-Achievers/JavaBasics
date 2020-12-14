package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array46 
{
    public static void main(String[] args) 
    {
        System.out.println(" Enter the length ");
          Scanner sc = new Scanner(System.in);      // scanner class object
          int length = sc.nextInt();      //  array length 
          System.out.println("Enter the elements ");
          int arr1[] = new int[length];    // array to the elements 
          int arr2[] = new int[length];
          int arr3[] = new int[arr1.length + arr2.length];    // creating another array for  concatenating elements into arra3 
        
            for( int i = 0 ; i < arr1.length; i++)    // Reads array1 elements     
            {
                
                    arr1[i] = sc.nextInt();
                
            }
            for( int i = 0 ; i < arr2.length; i++)    // Reads array2  elements
            {
                
                    arr2[i] = sc.nextInt();
                
            }
            System.arraycopy(arr1, 0, arr3, 0, arr1.length);      
            System.arraycopy(arr2, 0, arr3, arr1.length , arr2.length);    
            System.out.println(Arrays.toString(arr3));  //stores the elements in arr3
            sc.close();     //scanner close
    }
}
    

