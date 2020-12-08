package Arrays;

import java.util.Scanner;

public class Array16
 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in); //input user
        int n=sc.nextInt(); //read an elemt
        int arr[]=new int[n]; //arr len
       // int lar =arr[0];

        for(int i=0;i<arr.length;i++) //loop for length
        {
            arr[i]=sc.nextInt(); //read an elem
        } 
        for (int i=0;i<arr.length;i++) //loop for read an elem
        {
            for(int j=0;j<arr.length;j++)
            {
            if(arr[i]>arr[j])//chcks the arr
            {
                int temp=arr[i]; //min value stores in arr swapping
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        }
        System.out.println("3rd largestlength "+arr[arr.length-3]);
        System.out.println("2nd largest number:"+arr[1]);
        sc.close();
    }
 }
