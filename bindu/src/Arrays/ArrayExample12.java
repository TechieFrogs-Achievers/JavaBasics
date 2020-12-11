package Arrays;

import java.util.Scanner;

public class ArrayExample12 
{
    public static void main(String[] args)
    {
         System.out.println("Enter the elements:");
         Scanner sc = new Scanner(System.in);  //scanner class object
         int length = sc.nextInt();   //integer creation
         int arr[] = new int [length];   //stores the array elements
         int sum = 0;  
         for(int i=0;i<arr.length;i++)
         {
             arr[i]=sc.nextInt();
         }
         
        for (int i = 0; i < arr.length; i++)   //reads the array elements
        {  
              sum = sum + arr[i];  
        }  
        System.out.println("Sum of all elements in array: " + sum);  //prints the sum  
        sc.close();   //scanner close
    }  
}


    

