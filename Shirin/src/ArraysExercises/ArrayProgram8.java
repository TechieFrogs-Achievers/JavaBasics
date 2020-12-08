package ArraysExercises;

import java.util.Scanner;

public class ArrayProgram8 
{
    public static void main(String[] args) 
    {
        System.out.println(" Enter the length :");
        Scanner sc = new Scanner(System.in);//scanner class
        int length = sc.nextInt();// array length
        System.out.println(" Enter the elements");
        int array[] = new int[length];// array for storing elements
        for( int i =0; i < array.length; i++)
        {
            array[i] = sc.nextInt();//reading the elements
        }
        for(int  i = 0; i <array.length ; i = i+2)// loop for checking  odd number
        {
            System.out.println(" The odd number :" +array[i]);
        }
        sc.close();// closing scanner class
        
    }
    
}
