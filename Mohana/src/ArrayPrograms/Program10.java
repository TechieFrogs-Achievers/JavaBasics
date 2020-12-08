package ArrayPrograms;

import java.util.Scanner;

public class Program10 
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

        System.out.println("smallest  element in an array");
         
        int min = arr[0];
        for(int j = 0; j <arr.length;j++)
        {

            if(min > arr[j]) //condition to check largest element
            { 
                min = arr[j]; 
            }     
        }   
        System.out.println(min);

        sc.close();
 
        
    }
    
}
