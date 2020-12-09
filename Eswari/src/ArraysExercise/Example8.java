package ArraysExercise;

import java.util.Scanner;

//class for printing elements on odd position of an array
public class Example8 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);          //scanner class for taking input from user
        int length = scan.nextInt();                //taking length for array
        int array[] = new int[length];              //creating array
        for(int i = 0; i< array.length; i++)                //loop for reading array elements
        {
            //reading elements of ana array
            array[i] = scan.nextInt();
        }
        System.out.print("The odd position array elements are: ");
        //loop for printing elements until array length is there
        for(int i = 0; i < array.length; i++)
        {
            //if i is not divided by 2 then it takes odd position 
            if(i % 2 !=0)
            {
                //printing odd position array elements
                System.out.print(array[i] +" ");
            }
        }
        scan.close();           //scanner close
        
    }
}
