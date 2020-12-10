package ArraysExercises;

import java.util.Scanner;

public class ArrayProgram10 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the length");
        Scanner sc = new Scanner(System.in);// scanner class
        int length = sc.nextInt();// array length
        int array[] = new int[length];// initiallizing array for storing array elements
        for( int i =0; i < array.length; i++)
        {
            array[i] = sc.nextInt();// reading elements
        }
        int smallestnum=array[0];// taking smallest element
        for(int i =0; i < array.length; i++)
        {
            if(array[i] < smallestnum)// checking smallest element with another element
            {
                smallestnum = array[i];

            }
        }
        System.out.println(" The smallest number is " +smallestnum);// printing smallest element
        sc.close();
        

        
    }
    
}
