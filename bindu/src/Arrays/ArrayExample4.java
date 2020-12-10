package Arrays;

import java.util.Scanner;

public class ArrayExample4 
{
    public static void main(String[] args)
     {
         System.out.println("Enter the Number:");
        Scanner sc = new Scanner(System.in);  //scanner class object
        int Num = sc.nextInt();  //integer creation 
        int arr[] = new int [Num];      //array that stores the elements
        for(int k = 0; k< arr.length; k++) 
        {  
             arr[k]=sc.nextInt();   //reads the elements 
        }
        for(int k = 0; k<arr.length; k++) 
        {  
            for(int j = k + 1; j < arr.length; j++)   //compares the array elements 
            {  
                if(arr[k] == arr[j])   //checks the array elements equals
                { 
                    System.out.println(arr[j]);   //prints the array elements 
                }  
                
            }  
        }
        sc.close();    //scanner close
        
    }
    
}
