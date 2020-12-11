package ArrayPrograms;

import java.util.Scanner;

public class RightRotateP13
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);//creating scanner obj
        int length = sc.nextInt(); //length of the array
        int array1[] = new int[length];//initializing an array                     
         System.out.println("enter array elemnents ");
        for(int i = 0; i < array1.length; i++)
        {
            //taking input from keyboard
            array1[i] = sc.nextInt();
        }
        System.out.println("enter no of rotations  ");
        
        //enter no of rotations

        int rotations = sc.nextInt();             

        int temp;     

        for(int i =0; i < rotations; i++)
        {
            temp = array1[array1.length-1];

            //assigning the last element of an array to temporary variable

            for(int j = array1.length-1; j > 0; j--)
            {
                
                array1[j] = array1[j-1];              
            }
            array1[0] =temp; //the last element is assigned to first position of array
        }

        System.out.print("array elemnets after Right rotation  : ");
       
        for(int i =0 ; i < array1.length; i++)//loop for printing array elements 
        {
            System.out.print(array1[i] +" ");
        }
        sc.close();               
        
    }
    
}
