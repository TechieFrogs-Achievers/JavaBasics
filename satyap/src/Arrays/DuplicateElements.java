package Arrays;
import java.util.*;
public class DuplicateElements  // class for print Dupliacte elements in an array
{
    public static void main(String[] args) {
        //int arr[]=new int[]{1,2,5,4,5,3,6,3};
        System.out.println("Duplicate elements in given array:");
        Scanner sc=new Scanner(System.in); // Scanner class for input
        int length=sc.nextInt();
        int arr[]=new int[length];
        for(int i=0;i<arr.length;i++) // storing elements in array
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++) // comparing the first value with other values
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j]) //if two values are equal then print that value
                {
                    System.out.println("Duplicate values:"+arr[j]);
                }
            }
        }
        sc.close(); //Scanner class close
    }
}
