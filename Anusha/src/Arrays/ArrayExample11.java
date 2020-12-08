package Arrays;
import java.util.*;

//import sun.security.util.Length;
public class ArrayExample11 
{
    public static void main(String[] args) 
    {
        int []arr1 = {1,2,3,4,5,6,8,9,10};//array elements
         int count=0;
         for(int i=0;i<arr1.length;i++)//count the number of elements in the given array
         {
             count++;
         } 
         //System.out.println(" number of elements present in the array is: "+arr1.length);
         System.out.println(" number of elements present in the array is: "+ count++);
    }
}
