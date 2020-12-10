package Arrays;

import java.util.Scanner;

public class Array12sum
 {
public static void main(String[] args)
 {
     Scanner sc= new Scanner(System.in); //input user
    int n=sc.nextInt(); //read the elem
    int arr[]=new int[n]; //store in arr
    //int n1;
    for(int i=0;i<arr.length;i++)//loop for read len
    {
        arr[i]=sc.nextInt(); //read the elem
    }
    int sum=0 ;
    for(int i=0;i<arr.length;i++)// read of elem
    {
       sum=sum+arr[i]; //add of two numbers
    }
        System.out.print(sum+" ");
        sc.close();
    }
    }
    

