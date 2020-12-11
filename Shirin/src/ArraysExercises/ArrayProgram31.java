package ArraysExercises;

import java.util.Scanner;

public class ArrayProgram31 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the length ");
        Scanner sc = new Scanner (System.in);    //scanner class
        int length = sc.nextInt();   //array length
        System.out.println("Enter the element :");
        int arr[][] = new int[length][length];    //array for storing the data
        for(int i =0 ; i < arr.length; i++)    // loop for reading first element
        {
            for(int j =0; j < arr.length; j++)
            {
                arr[i][j] = sc.nextInt();    //reading
            }
        }
        System.out.println("The upper triangle :");
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr.length; j++)
            {
                if(j<i)  // if j value is greater than i it prints zero
                {
                    System.out.print("0 ");
                }
                else
                {
                    System.out.print(arr[i][j]+ " ");   // it print matrix
                }
            }
            System.out.println();
        }
        sc.close();   // scanner class close
        
        
    }
    
}
