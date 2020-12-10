package Arrays;

import java.util.Arrays;

public class Array46 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the elements:");
         int arr1[] = {3, 7, 8};// Intiallizing variable
         int arr2[] = {9, 3, 8};
         int arr3[] = new int[arr1.length+arr2.length];// initializing array3 to concatenate the 2 arrays in array3
         System.arraycopy(arr1, 0, arr3, 0, arr1.length);  //prints the elements from the position 0 the paticular length
         System.arraycopy(arr2, 0, arr3, arr1.length , arr2.length);
         System.out.println(Arrays.toString(arr3));//stores the elements of arrays
        
    }
    
}
    

