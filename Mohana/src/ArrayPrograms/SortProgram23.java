package ArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class SortProgram23 
{
    public static void main(String[] args) 
    {
        int arr[] =new int[6];//array with length 6 

        Scanner sc = new Scanner(System.in);//scanner class obj creation
        System.out.println("enter array elemnets : " );

        for(int i = 0; i <=5 ; i++)//loop to iterate upto length
        { 
            arr[i] = sc.nextInt();//taking input from keyboard

        } 
        System.out.println("array elemnts : " );
       //loop for printing array elemnents
        for(int i :arr)
        {
            System.out.print(i + " " );
        }  

        System.out.println();
        
        //method to sort elements
        Arrays.sort(arr);
        System.out.println("Sorted array : " + Arrays.toString(arr));
        sc.close();
        
    }
    
}
