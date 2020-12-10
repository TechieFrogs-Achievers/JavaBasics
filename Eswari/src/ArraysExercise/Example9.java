package ArraysExercise;

import java.util.Scanner;

//class for printing largest number in an array
public class Example9 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);                  //scanner class for taking input from user
        int length = scan.nextInt();                    //taking length of an array
        int array[] = new int[length];                      //creating array
        //intially take a largest element as first element in array
        int largest = array[0];                             

        //loop for reading array elements from console
        for(int i = 0; i < array.length; i++)
        {
            //reading array elements
            array[i] = scan.nextInt();
        }
        //loop is iterated until the array length is there
        for(int i = 0; i < array.length; i++)
        {
            //checking the all elements with first array element
            if(array[i] > largest )
            {
                //if present element is greater than first element the take that element as largest
                largest = array[i];
                
            }
        }
        //printing that largest element
        System.out.println("The largest element in an array is : " +largest);
        scan.close();               //scanner close

        
    }
}
