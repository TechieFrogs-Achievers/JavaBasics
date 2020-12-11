package Arrays;

import java.util.Scanner;

//import javax.naming.spi.DirStateFactory.Result;

public class StandardDeviation 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in); //scanner class
        int length = sc.nextInt(); //input length
        int[] val = new int[length];
        int sum=0;
        double average ;
        double StdDev=0.0;
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

        for(int i=0;i<val.length;i++)
        { 
            StdDev= StdDev+Math.pow(val[i]-average,2 );

        }
        System.out.println("Standard Deviation of array elements :" +(Math.sqrt(StdDev/(length))) );

        sc.close();
        
    }
    
}
