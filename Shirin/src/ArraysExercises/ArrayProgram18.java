package ArraysExercises;

import java.util.Scanner;

public class ArrayProgram18 
{
    public static void main(String[] args)
    {
        System.out.println("Enter the length");
        Scanner sc = new Scanner(System.in);    // scanner class
        int length = sc.nextInt();  // array length
        int array[] = new int[length];   // array for storing the elements
        for( int i =0; i < array.length; i++)
        {
            array[i] = sc.nextInt();   // reading elements
        }
        int largenum=array[0];   // taking large element
        for(int i =0; i < array.length; i++)
        {
            if(largenum < array[i])   // checking large element with another element
            {
                largenum = array[i];

            }
        }
        System.out.println(" The largest number is " +largenum);  // printing 
        sc.close();   // closing scanner class
        
    }
    
}
