package ArraysExercise;

import java.util.Scanner;

//class for printing array elements in reverse order
public class Example6 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
    int length = scan.nextInt();
    int array[] = new int[length];
    //loop for reading array elements from console
    for(int i = 0; i < length; i++)
    {
        //reading array elements
        array[i] = scan.nextInt();
    }

    //loop for printing array elements in reverse order
    for(int i = array.length- 1; i >= 0; i--)
    {
        //array elements printing
        System.out.println(array[i]);
    }
    scan.close();                   //scanner close
        
    }
}
