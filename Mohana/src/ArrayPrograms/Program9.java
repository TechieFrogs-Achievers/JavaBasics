package ArrayPrograms;

import java.util.Scanner;

public class Program9 
{
    public static void main(String[] args) 
    {
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

        System.out.println("largest element in an array");
         
        int max = arr[0];
        for(int j = 0; j <arr.length;j++)
        {

            if(max < arr[j]) //condition to check largest element
            { 
                max = arr[j]; 
            }     
        }   
        System.out.println(max);

        sc.close();

        
    }
    
}
