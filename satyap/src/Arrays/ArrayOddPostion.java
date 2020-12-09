package Arrays;
import java.util.*;
public class ArrayOddPostion // class for print array having odd postion elements 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); // Scanner class
        int length=sc.nextInt();
        int arr[]=new int[length];
        System.out.println("Enter elements in array:");
        for(int i=0;i<arr.length;i++) // for loop for stroing array elements
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Odd Postion in array:");
        for(int i=0;i<arr.length;i=i+2) // for loop for printing odd postion elements
        {
            arr[i]=sc.nextInt();
            System.out.print(arr[i]);
        }
        sc.close(); // scanner class close
    }
}
