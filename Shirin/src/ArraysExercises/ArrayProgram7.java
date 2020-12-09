package ArraysExercises;

import java.util.Scanner;

public class ArrayProgram7 
{
    public static void main(String[] args) 
    {
        System.out.println(" Enter the length :");
        Scanner sc = new Scanner(System.in);//scanner class
        int length = sc.nextInt();// array length
        System.out.println(" Enter the elements");
        int array[] = new int[length];// array for storing the elements
        for( int i =0; i < array.length; i++)
        {
            array[i] = sc.nextInt();// reading  elements
        }
        for(int  i = 1; i <array.length ; i = i+2)// loop for checking  even number  with given elements
        {
            System.out.println(" The even number :" +array[i]);
        }
        sc.close();// closing scanner class
        

        
    }
    
}
