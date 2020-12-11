package ArraysExercise;

import java.util.Scanner;

//class to calculate standard deviation
public class Example40 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);          //scanner class for taking inputs from user
        int length = scan.nextInt();                    //taking length of an array from user
        double array[] = new double[length];            //creating array
        for(int i = 0; i < array.length; i++)           //loop for reading array elements from console
        {
            //reading array elements
            array[i] = scan.nextDouble();
        }
        double sum = 0, mean;
        //loop for taking sum of array elements
        for(int i = 0; i < array.length; i++)
        {
            sum = sum +array[i];        //sum formula
        }
        //mean is nothing but average
        mean= sum/array.length;
        System.out.println("The mean of an array is : " +mean);
        double deviation = 0;
        //loop for calculating deviation of an array elements
        for(int i = 0; i < array.length; i++)
        {
            //deviation formula
            deviation = deviation +Math.pow((array[i] - mean), 2);
        }
        //mean of deviation
        mean = deviation/(array.length - 1);
        System.out.println("Standard deviation is : " +Math.sqrt(mean));        //standard deviation formula
        scan.close();           //scanner close
    }
    
}
