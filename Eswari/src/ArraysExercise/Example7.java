package ArraysExercise;

import java.util.Scanner;

//class for printing the elements of an array present on even position
public class Example7 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);              //scanner class for taking input from user
        int length = scan.nextInt();                    //giving length of an array
        int array[] = new int[length];                      //creating array with length    
        //loop for reading array elements
        for(int i = 0; i < array.length; i++)
        {
            //reading elements of an array
            array[i] = scan.nextInt();
        }

        System.out.print("The even position elements are :  ");
        //loop is iterated until array length
        for(int i = 0; i < array.length; i++)
        {
            //this if condition takes even position
            if(i % 2 == 0)
            {
                //printing elemets on even position
                System.out.print(array[i] +" ");
            }
        }
        scan.close();           //scanner close
        
    }
    
}
