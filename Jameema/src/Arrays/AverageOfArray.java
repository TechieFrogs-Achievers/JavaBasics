package Arrays;

import java.util.Scanner;

public class AverageOfArray 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in); //scanner class
        int length = sc.nextInt(); //input length
        int[] val = new int[length];
        int sum=0;
        double average;
        for(int i=0;i<val.length;i++) //read the input
        {
            val[i]=sc.nextInt();
        }
        for(int i=0;i<val.length;i++)
        {
            sum+=val[i]; //adding all the elements in array
        }
        System.out.println("the sum of elements in array  :"+sum); //prints the sum of elements

        average = sum/val.length;
        System.out.println("the average of array elements  :"+average); //prints the average of elements
        sc.close();

        
    }
    
}
