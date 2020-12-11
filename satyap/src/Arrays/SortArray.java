package Arrays;
import java.util.*;

public class SortArray // prining array elements in sorted order using function
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int arr[]=new int[length];
        System.out.println("Enter elements in array:");
        for(int i=0;i<arr.length;i++) // storing elements in array
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);// function for sorted order in ascending
        System.out.println("Elements in sorted order:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
