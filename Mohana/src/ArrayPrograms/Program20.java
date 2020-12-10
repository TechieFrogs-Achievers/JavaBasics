package ArrayPrograms;

import java.util.Scanner;

public class Program20 
{
    public static void main(String[] args) 
    {  
          
           
        Scanner sc = new Scanner(System.in);//scanner class obj creation
        System.out.println("enter lengtho of the array ");

        int length = sc.nextInt();//taking length

        int arr[] = new int[length];//creating an array
        
        for(int i = 0; i < length ;i++)
        {
            arr[i] =sc.nextInt();//taking input 
        }  

        System.out.println("elements in an array");

         for(int i : arr)
         {
             System.out.print( i + " "); //printing array elements
         }
         System.out.println();

        for(int i = 0;i <arr.length ;i++) //loop to iterate 
        {
            for(int j = i+1 ; j <arr.length; j++)//loop to check condition
            {
                if(arr[i] > arr[j])//condition to check  smaller number
                { 
                    //swaping values
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] =temp;
                }
            } 
        }  
        
        System.out.println("smallest number in array : " +arr[0]);
        sc.close();
        
    }
    
}
