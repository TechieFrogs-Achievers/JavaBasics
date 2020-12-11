package Arrays;
import java.util.*;
public class OddEvenNumbers //class for printing even and odd numbers
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
        System.out.println("Even element:");
        for(int i=0;i<arr.length;i++)// printing even numbers
        {
            if(arr[i]%2==0)
            {
                System.out.println(arr[i]);
            }
        }
        System.out.println("Odd elements:");
        for(int i=0;i<arr.length;i++)  //printing odd numbers
        {
            if(arr[i]%2!=0)
            {
                System.out.println(arr[i]);
            }
        }
        sc.close();
    }
}
