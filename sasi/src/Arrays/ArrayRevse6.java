package Arrays;

import java.util.Scanner;

public class ArrayRevse6 
{
    public static void main(String[] args)
     {
        Scanner sc= new Scanner(System.in); //input user
        int n=sc.nextInt(); // read the elemts
        int arr[]=new int[n];//take the elemts of 
        //int rev=0,r;
        for(int i=0;i<arr.length;i++) // loop for length
        {
            arr[i]=sc.nextInt(); // read the elemts
        }
        for(int i=arr.length-1;i>=0;i--) //loop for reverse
        {
            System.out.println(arr[i]);
        }
    }
}
