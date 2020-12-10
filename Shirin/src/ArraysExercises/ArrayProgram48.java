package ArraysExercises;

import java.util.Scanner;

public class ArrayProgram48 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the length:");
        Scanner sc = new Scanner(System.in); //scanner class object
        int length = sc.nextInt();  //initializing the length
        System.out.println("Enter the elements");
        int array[] = new int[length]; // array for storing the elements
        int toFind = 4;
        boolean found = false;   // initializing the boolean value
        for(int i=0;i<array.length;i++)
        {
           array[i] = sc.nextInt();  //reads the array elements
        }
        for(int n:array)  //loop for checking each statement
        {
            if(n==toFind) 
            {
                found=true;
                break;
            }
        }
        if(found)   // if the value found it prints  the founded value
        {
            System.out.println(toFind+" "+" is found");
        }
       else
       {
           System.out.println(toFind+" "+"is not found");  //prints value not found
       }
       sc.close();  //scanner close
   }
        
      
}
