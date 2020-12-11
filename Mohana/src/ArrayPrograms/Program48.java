package ArrayPrograms;

import java.util.Scanner;

public class Program48 
{
    public static void main(String[] args) 
    {
        System.out.println("enter length of an array");

        Scanner sc = new Scanner(System.in);//creating scanner obj

        int length = sc.nextInt(); //length of the array

        int array1[] = new int[length];//initializing an array

         System.out.println("enter array elemnents ");

        for(int i = 0; i < array1.length; i++)
        {
            //taking input from keyboard
            array1[i] = sc.nextInt();
        }  

        System.out.println("array elements : ");
        for(int i : array1)
        {
            System.out.print(i + " "); //printing array elements
        }  

        System.out.println();

        System.out.println("enter the element to cheeck : ");
        int element = sc.nextInt(); //taking input from keyboard  to chaeck elemnent

        boolean value = false;

        for(int i =0;i<array1.length;i++)
        {
            if(array1[i] == element) //condition to check element is there or not
            {
               value =true; //if element found boolean value is true
            }
        }
         if(value == true) 
         
         {
             System.out.println(" Your element found in array");
         } 
         else
         {
             System.out.println("Your element is  not found ");
         }

        sc.close();
    }
    
}
