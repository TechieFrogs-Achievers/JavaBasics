package ArraysExercise;

import java.util.Scanner;

//class for printing average of an array
public class Example38 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);              //scanner class for taking input from user
        int length = scan.nextInt();                        //taking length of an array from user
        int array[] = new int[length];                      //creating array
        int sum;
        //loop for reading array elements from console
        for(int i=0; i < array.length;i++)
        {
            //reading array elements
            array[i] = scan.nextInt();
        }
        sum = 0;
        //loop for printing sum of an array elements
        for(int i = 0; i < array.length; i++)
        {
            //sum of each array element
            sum = sum + array[i];

        }
        System.out.println("The sum of array elements is : "+sum);
        //average of array elements
        float average = sum/(length);
        System.out.println("The average of array elemnts : "  +average);        
        scan.close();               //scanner close
    }
    
}
