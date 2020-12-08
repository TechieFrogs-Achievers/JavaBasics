package ArrayPrograms;

import java.util.Scanner;

public class Program22 
{
    public static void main(String[] args) 
    {
         
        Scanner sc = new Scanner(System.in);//scanner class obj creation

        int length = sc.nextInt();//taking length

        int arr[] = new int[length];//creating  an array
        
        for(int i = 0; i < length ;i++)
        {
            arr[i] =sc.nextInt();//taking input 
        } 

        System.out.println("elements in an array");
        for(int i :arr)//loop to print array elements
        {
            System.out.print(i + " ");
        }   
        System.out.println();
     
          System.out.println("even numbers : ");
        for(int i =0; i < arr.length;i++)
        {  
            if(arr[i]%2 == 0)//condition for even numbers
            {
            System.out.print(arr[i] +" ");
            }
        } 
        System.out.println();

          System.out.println("odd numbers : ");

        for(int j = 0 ; j< arr.length; j++)
        {
            if(arr[j]%2 != 0 )//condition for odd numbers
            {
                System.out.print(arr[j] + " ");
            }
        }
    
        sc.close();  
    }
    
}
