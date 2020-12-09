package ArrayPrograms;

import java.util.Scanner;

public class Program17 
{
    public static void main(String[] args) 
    {
         
        Scanner sc = new Scanner(System.in);//scanner class obj creation

        int length = sc.nextInt();//taking length

        int arr[] = new int[length];//creatin an array
        
        for(int i = 0; i < length ;i++)
        {
            arr[i] =sc.nextInt();//taking input 
        }  

        System.out.println("elements in an array");

        for(int i : arr)
        {
            System.out.print( i +" "); //printing array elements
        } 
       System.out.println();

       for(int i = 0;i <arr.length ;i++) //loop to iterate 
       {
           for(int j = i+1 ; j <arr.length; j++)//loop to check condition
           {
               if(arr[i] < arr[j])//condition to check  bigger number number
               { 
                   //swaping values
                   int temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] =temp; 
                 

               }
           } 
       }  
        
       System.out.println("second largest number " + arr[1]);
          sc.close();
        
    }
    
}
