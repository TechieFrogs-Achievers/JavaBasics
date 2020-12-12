package ArraysExercises;

import java.util.Scanner;

import javax.management.StandardEmitterMBean;

public class ArrayProgram40 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the length");
        Scanner sc = new Scanner(System.in);      // scanner class
        int length = sc.nextInt();      // array length
        System.out.println(" Enter the element");
        int array[] = new int[length];     // Initiallizing array for stroring the data element
        for(int i =0; i < array.length; i++)
        {
            array[i] = sc.nextInt();    // Reading elements
        }
        int sum = 0;     // Initiallizing variable 
        double standarddev = 0.0;     

        for( int i =0; i < array.length; i++)    // loop for  checking the elements
        {
            sum = sum+array[i];           // Adding the elements into sum
        }
        int mean = sum/array.length;      // calculating mean 
        System.out.println();
        System.out.println("mean value :" +mean);

        for(int i =0; i < array.length; i++)
        {
            standarddev = standarddev +Math.pow(array[i]-mean, 2);     // standard deviation condition
        }
        System.out.println(Math.sqrt(standarddev/array.length));
        sc.close();  // scanner class close

        
    }
    
}
