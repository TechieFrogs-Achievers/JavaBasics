package Arrays;

import java.util.Scanner;

public class ArrayExample48 
{
    public static void main(String[] args)
     {
         System.out.println("Enter the elements:");
         Scanner sc = new Scanner(System.in); //scanner class object
         int length = sc.nextInt();  //initializing the length
         int arr[] = new int[length]; //initializing the array to store the elements
         int toFind = 10;
         boolean found = false;   // initializing the boolean value
         for(int i=0;i<arr.length;i++)
         {
            arr[i] = sc.nextInt();  //reads the array elements
         }
         for(int n:arr)   //for each statement
         {
             if(n==toFind) 
             {
                 found=true;
                 break;
             }
         }
         if(found)   //if the value is found then it prints the element as found
         {
             System.out.println(toFind+" "+" is found");
         }
        else
        {
            System.out.println(toFind+" "+"is not found");  //prints value not found
        }
        sc.close();  //scanner close
    }
    
}
