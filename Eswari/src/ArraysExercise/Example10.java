package ArraysExercise;

import java.util.Scanner;

//class for printing smallest element in an array;
public class Example10 
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);              //scanner class for taking input from user
        int length = scan.nextInt();                    //taking length of an array
        int array[] = new int[length];                  //creating array
        // int smallest = array[0];
        for(int i = 0; i < array.length;i++)            //loop for reading array elements
        {
            //reading elements
            array[i] = scan.nextInt();
        }
        int smallest = array[0];
        //loop is iterated until array length is there
        for(int i = 0; i < array.length; i++)
        {
            //checking all elements in an array with first element in array
            if(array[i] < smallest)
            {
                smallest = array[i];
                // array[i] = smallest;
            }
        }
        //printing smallest array element in an array
        System.out.println("The smallest element in an array is :  " +smallest);
        scan.close();               //scanner close
    }
    
}
