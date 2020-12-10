package Arrays;

import java.util.Scanner;

public class ArraysAverage
 {
    public static void main(String[] args)
    {
        int sum=0, Average =0;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the length of the array");
    int n = sc.nextInt();//taking length from keyboard
    int array1[] = new int[n];//passing length to array
    System.out.println("enter the array elements");
    for(int i=0; i<array1.length; i++)
    {
        array1[i] = sc.nextInt();
        sum = sum+array1[i];
    }
    System.out.println("the sum of array elemennts ="+sum);
    Average = sum/n;
    System.out.println("the Average of array elements ="+Average);
    sc.close();
}


}

