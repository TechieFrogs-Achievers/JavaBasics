package ArraysExercise;

import java.util.Scanner;

//class for printing duplicate numbers in an array
public class Example4 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);              //scanner class for taking input from user
        int length = scan.nextInt();                        //taking length of an array
        int array[] = new int[length];                      //creating array with length

        ////loop for reading array elements
        for(int i = 0; i < array.length; i++)
        {
            //reading array elements
            array[i] =scan.nextInt();
        }

        //loop for taking one element in an array
        for(int i = 0; i < array.length; i++)
        {
            //loop for taking another elements in ana array
            for(int j = i+1; j < array.length; j++)
            {
                //checking two elements are same or not
                if(array[i] == array[j])
                {
                    //if two elements are same then duplicates are there in aaray 
                    System.out.println("The duplicate elements in an array are: " +array[i]);
                }
            }
            
        }
        scan.close();               //scanner close
        
    }
    
}
