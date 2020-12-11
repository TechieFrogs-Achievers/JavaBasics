package Arrays;

import java.util.Scanner;

public class Array5
 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in); //input user
        int n=sc.nextInt(); // read the elemts 
        int arr[]=new int[n]; //arry len
        for(int i=0;i<arr.length;i++) //loop for len
        {
            arr[i]=sc.nextInt(); // read the elements 
        }
        for(int i=0;i<arr.length;i++) // read the elemts
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
