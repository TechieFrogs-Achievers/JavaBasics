package Arrays;

import java.util.Scanner;

public class ArrayExample6 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the number of elements:");
        Scanner sc = new Scanner(System.in);   //scanner class object
        int num = sc.nextInt();   //integer creation 
        int arr[]=new int[num];  //stores the array elements
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();    
        }
        for(int i=arr.length-1;i>=0;i--)   //checks the array length 
        {
            System.out.println(arr[i]);   //prints the array elements 
        }
        
        sc.close();  //scanner close
    }
   
}
