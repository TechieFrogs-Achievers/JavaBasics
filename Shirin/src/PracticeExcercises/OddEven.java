package PracticeExcercises;

import java.util.Scanner;



public class OddEven 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);    // scanner class
        System.out.println("Enter the Digits :");
        int num =  sc.nextInt();       // method for giving input data type
        int arr[] = new int[num];      // initiallizing array for storing the input
        for( int i = 0; i < num; i++)
        {
            arr[i] = sc.nextInt();     // reading input 
        }
        for(int i =0 ; i < num ; i++)    // loop for checking the input digits
        {
            if(arr[i]%2 != 0)       // checking odd digits
            {
               arr[i]--;
            System.out.println(arr[i]);
            }
        
          else if(arr[i]%2 == 0)     // checking even digits
          {
             arr[i]++;
             System.out.println(arr[i]);
          }
          else
          {
              System.out.println();
          }
        
        }
        sc.close(); // scanner class close
    }
    
}
