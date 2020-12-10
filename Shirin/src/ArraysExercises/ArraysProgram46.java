package ArraysExercises;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysProgram46 
{
    public static void main(String[] args) 
    {
         int arr1[] = {2, 4, 5};   // Intiallizing variable
         int arr2[] = {5, 3, 1};
         int arr3[] = new int[arr1.length+arr2.length];   // concatenating elements into arra3
         System.arraycopy(arr1, 0, arr3, 0, arr1.length);
         System.arraycopy(arr2, 0, arr3, arr1.length , arr2.length);
         System.out.println(Arrays.toString(arr3));  //storing the elements in arr3

        
    }
    
}
