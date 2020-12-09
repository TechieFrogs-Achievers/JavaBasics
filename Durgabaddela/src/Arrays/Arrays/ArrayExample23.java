package Arrays;

import java.util.Arrays;

public class ArrayExample23
 {
    public static void main(String[] args)
    {
       int[] a = {20,3,5,45,34,22};
       Arrays.sort(a);//sorting method to sort the array elements
       System.out.println("the sorted array ");
       for(int i:a)
       {
           System.out.print(i+" ");
       }
       System.out.println();
    }
}
