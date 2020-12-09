package Arrays;
import java.util.*;
public class ArrayEvenPostions  // Class to print array elements present in even posstion
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); // Scanner class
        int length=sc.nextInt();
        int arr[]=new int[length];
        System.out.println("Enter elements in array:");
        for(int i=0;i<arr.length;i++) // storing elements in array
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Elements in even position");
        for(int i=1;i<arr.length;i=i+2) // printing even postion elements
        {
           System.out.println(arr[i]);
        }
        sc.close();
    }
}
