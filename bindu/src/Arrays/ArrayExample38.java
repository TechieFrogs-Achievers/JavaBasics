package Arrays;

import java.util.Scanner;

public class ArrayExample38
 {
     public static void main(String[] args) 
     {
         System.out.println("Enter the number:");
         Scanner sc = new Scanner(System.in);  //scanner class object
         int length = sc.nextInt(); //integer creation 
         int arr[] = new int[length]; //array that stores the elements 
         int avg ; //initializing the average
         int sum=0; 
         for(int i=0;i<arr.length;i++)
         {
             arr[i]=sc.nextInt();  //reads the array elements
         }
         for (int i = 0; i < arr.length; i++)   //reads the array elements
        {  
              sum = sum + arr[i];  
        }
              avg = sum/ arr.length;    //condition to check the avg
        System.out.println("avg of all elements in array: " + avg);  //prints the avg 
        sc.close();   //scanner close
    }  
         
         
}
    

