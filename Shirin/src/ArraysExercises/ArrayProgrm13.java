package ArraysExercises;

import java.util.Scanner;

public class ArrayProgrm13 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the length :");
        Scanner sc = new Scanner(System.in);    //scanner class 
        int length = sc.nextInt();             //length of array
        System.out.println("Enter the element ");
        int array[] = new int[length];        //initializing  array to storing the elements

        for(int i = 0; i < array.length; i++)               
        {
            array[i] = sc.nextInt();   //reading array elements
        }
        System.out.println("Enter  position number : ");
        int positions = sc.nextInt();     // Initializing variable for taking position          

        int temp;                   //temporary variable to swap the elements
        for(int i =0; i < positions; i++)
        {
            temp = array[array.length-1];            //assign the first element to temporary variable
            
            for(int j = array.length-1; j > 0; j--)
            {
                
                array[j] = array[j-1];      //change the position of an array             
            }
            array[0] =temp;           //the first element is assigned to last position of array
        }
        
        System.out.print("Elements of Right shift: ");

        for(int i =0 ; i < array.length; i++)
        {
            
            System.out.print(array[i] +" "); //printing the elements
        }
        sc.close();       // scanne rclass close
        
    }
    
}
