package Arrays;

import java.util.Scanner;

public class ArrayExample22 
{
    public static void main(String[] args)
     {
        System.out.println("Enter the Elements:");  
        Scanner sc = new Scanner(System.in); //scanner class object
        int m = sc.nextInt();   //integer creation 
        int arr[]= new int[m]; //initializing array that stores the elements
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();   //reads the elements
        }
        for(int i=0;i<arr.length;i++)   //checks & reads  the array elements
        {
            if(arr[i]%2==0)   //condition to check the even number
            {
                System.out.println("Even Number is:"+arr[i]);  //prints the number if it is even 
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==1)   //condition to check the odd number
            {
                System.out.println("Odd Number:"+arr[i]);  //prints the number if it is odd 
            }
            sc.close();  //scanner close
        }
        
    }
}
