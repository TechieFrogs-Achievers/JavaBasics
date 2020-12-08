package Arrays;

import java.util.Scanner;

public class SumOfArray 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in); //scanner class
        int length = sc.nextInt(); //input length
        int[] val = new int[length];
        int sum=0;
        for(int i=0;i<val.length;i++) //read the input
        {
            val[i]=sc.nextInt();
        }
        for(int i=0;i<val.length;i++)
        {
            sum+=val[i]; //adding all the elements in array
        }
        System.out.println("the sum of elements in array  :"+sum); //prints the
        sc.close();
    }
    
}
