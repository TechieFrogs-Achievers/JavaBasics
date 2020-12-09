package Arrays;

import java.util.Scanner;

public class StringExample7 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the elements:");
        Scanner sc = new Scanner(System.in);   //scanner class object
        int n = sc.nextInt();           //integer creation
        int arr[]=new int[n];      //array that stores the elements   
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();   //reads the elements
        }
        for(int i=0;i<arr.length;i++)
        {
            if(i%2==0)   //checks the condition
            {
                System.out.println("even position is :"+arr[i]);  //prints the even position numbers
            }
        }
        sc.close();   //scanner close
        
    }
    
}
