package ArraysExercises;

import java.util.Scanner;

public class ArrayProgram1 
{
    public static void main(String[] args) 
    {
         System.out.println(" Enter the number:");
          Scanner sc = new Scanner(System.in);// scanner class
           int length = sc.nextInt();
           int[] array1 = new int[length];// initiallizing elements in array
         int array2[]=  new int[length];// another array  with size of array1 
        for(int i =0; i < array1.length; i++)//loop for checking the array1 elements
        {
            array1[i] = sc.nextInt();// reading array1 elemnts
        }
          array2 = array1;// copying the elements
        for( int i =0 ; i < array2.length; i++)//loop for checking the array2 ellements with arra1 size 
        {  
            System.out.println(" After copying elements :");
           System.out.println(array2[i]+ " "); // printing copy elemnts
        }
        sc.close();// closing scanner class
        
        

    
        
    }   

    
    
}
