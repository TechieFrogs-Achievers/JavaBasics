package Arrays;
import java.util.*;
public class AscendingOrder 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int arr[]=new int[length];
        System.out.println("Enter elements in array:");
        for(int i=0;i<arr.length;i++) // storing elements in array
        {
            arr[i]=sc.nextInt();
        }
        int temp;
        for(int i=0;i<arr.length;i++) // for loop for taking array elements 
        {
            for(int j=i+1;j<arr.length;j++) // for loop for comparing other element 
            {
               if(arr[i]>arr[j]) //if first element greater than second element then swap the elements
               {
                  temp=arr[i];
                  arr[i]=arr[j];
                  arr[j]=temp;
               }
            }
        }
        System.out.println("Elements in ascending order:");
        for(int i=0;i<arr.length;i++) // print the elements
        {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
