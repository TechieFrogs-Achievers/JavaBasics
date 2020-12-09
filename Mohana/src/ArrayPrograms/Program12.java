package ArrayPrograms;

import java.util.Scanner;

public class Program12 
{
    public static void main(String[] args) 
    {  
        int sum =0;
        Scanner sc = new Scanner(System.in);//scanner class obj creation

        int length = sc.nextInt();//taking length

        int arr[] = new int[length];//creating an array
        
        for(int i = 0; i < length ;i++)
        {
            arr[i] =sc.nextInt();//taking input 
        }  
        System.out.println("array elements " );

        for(int i = 0;i < arr.length; i++)
        {
            System.out.print(arr[i] + " "); //to print array elements
        } 
        System.out.println();
        for(int k = 0; k <arr.length ;k++)
        {
           sum += arr[k];//sum of array elements 
        }

        System.out.println("sum of elements in an array : " +sum);

        sc.close();

        
    }
    
}
