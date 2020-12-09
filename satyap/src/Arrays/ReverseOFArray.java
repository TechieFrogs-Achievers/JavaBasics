package Arrays;
import java.util.*;
public class ReverseOFArray  // class for printing reverse of array elements 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//Scanner class
        int length=sc.nextInt();
        int arr[]=new int[length];
        System.out.println("Enter array elements:");
        for(int i=0;i<arr.length;i++) // storing array elements
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array in reverse order:");
        for(int i=arr.length-1;i>=0;i--) // for loop for printing count of elements in an array
        {
            System.out.println(arr[i]);
        }
        sc.close(); // scanner close
    }
}
