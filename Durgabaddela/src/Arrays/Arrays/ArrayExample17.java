package Arrays;

import java.util.Scanner;

public class ArrayExample17 
{
    public static void main(String[] args)
    {  
        int n, temp =0;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the length of the array");
     n = sc.nextInt();//taking length from keyboard
    int array1[] = new int[n];//passing length to array
    System.out.println("enter the array elements");
    for(int i=0; i<n; i++)
    {
        array1[i] = sc.nextInt();//taking array elements from keyboard
        
    }
    System.out.println("the  elements of array");
    for(int k:array1)
    {
    System.out.print(k+" ");
    }
    System.out.println();
    for (int i = 0; i < array1.length; i++) {
        for (int j = i + 1; j < array1.length; j++)
         {
            if (array1[i] < array1[j])
             {
                temp = array1[i]; // swapping elements
                array1[i] = array1[j];
                array1[j] = temp;
            }

        }
    }
    System.out.println();
    System.out.println("the 2rd Largest Number in given array=" + array1[1]);
    sc.close();
}
}
