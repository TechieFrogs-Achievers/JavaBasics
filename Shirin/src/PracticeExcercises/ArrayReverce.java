package PracticeExcercises;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverce 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length :");
        int length = sc.nextInt();    // method for initiallizing length
        System.out.println("Enter the array :");
        int arr[] = new int[length];    // method for giving input
        for( int i =0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();      // reading input array
        } 
         System.out.println("Enter the the reverse elements :");
         int reverse= sc.nextInt();       // method for reversing the elements
         int temp;
         for(int i=0;i < reverse;i++)
         {
              temp = arr[i];  //assigns the value to the 1st array element
             
             
            for(int j=0;j<arr.length-1;j++)
             {
             arr[j] = arr[j+1];     //change the position of an array
             }
             arr[arr.length-1] = temp;    //length of the array is equal to temp value 
         }
          
         for(int i=0;i<arr.length;i++)
         {
             System.out.print(arr[i]+" ");
         }
             sc.close();   //scanner class  close
         

        


        
        
    }
    
}
