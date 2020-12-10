package Arrays;
import java.util.*;
public class ElementsInArray // class for print elements of array
{
    public static void main(String[] args) {
        System.out.println("Enter elements in array:");
        Scanner sc=new Scanner(System.in); // Scanner class for input
        int length=sc.nextInt();
        int arr[]=new int[length];
        for(int i=0;i<arr.length;i++) // for loop for storing in array
        {
            arr[i]=sc.nextInt();
           // System.out.println(arr[i]);
        }
        System.out.println("Array Elements are:");
        for(int i=0;i<arr.length;i++) //print the array
        {
            System.out.print(arr[i]+" ");
        }
        
        sc.close(); // scanner close
    }
}
