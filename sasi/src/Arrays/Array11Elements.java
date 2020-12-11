package Arrays;

import java.util.Scanner;

public class Array11Elements
 {
    public static void main(String[] args)
     {
        Scanner sc= new Scanner(System.in); //input user
        int n=sc.nextInt(); //read the elem
        int arr[]=new int[n]; //store in arr
       // int count;
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt(); //elemnts reading
        }
       // for(int i=0;i<arr.length;i++)
       // {
           // count+=arr[i];
            System.out.print(arr.length+" ");
            sc.close();

        }
    }
