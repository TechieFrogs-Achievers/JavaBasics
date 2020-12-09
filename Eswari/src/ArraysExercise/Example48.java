package ArraysExercise;

import java.util.Scanner;

//class to check if an array contains given value
public class Example48 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);                  //scanner class for taking input from user
        int length = scan.nextInt();                            //taking length of an array from user
        int array[] = new int[length];                          //creating an array
        //loop for reading array elements from console
        for(int i = 0; i < array.length; i++)
        {
            //reading array elements
            array[i] = scan.nextInt();
        }
        System.out.println("Enter the number to check it is in array or not : ");
        int number = scan.nextInt();            //taking one element 
        boolean flag = false;
        for(int i = 0; i < array.length; i++)
        {
            //condition for taking element is present in an array or not
            if(array[i] == number)
            {
                // System.out.println("The number is prsent in an array");
                flag = true;//if condition is true than it is incremented
                // break;
            }
            // else
            // {
            //     System.out.println("The number is not prsent in an array");
            // }
        }
        if(flag)        //if flag is incremented than the element is pesent in an array
        {
            System.out.println("The number is prsent in an array");
        }
        //if tha condition is not incremented than that element is not present in an array
        else
        {
            System.out.println("The number is not prsent in an array");
        }
        scan.close();           //scanner close
        
    }
    
}
