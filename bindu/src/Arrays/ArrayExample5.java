package Arrays;

import java.util.Scanner;

public class ArrayExample5 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the elements:");
        Scanner sc = new Scanner(System.in);  //scanner class object
        int length = sc.nextInt();   //integer creation 
        int array[] = new int[length];  //stores the array elements
        for(int i=0;i<length;i++)       //loop that checks the number of elements in array  
        {
            array[i]=sc.nextInt();   //reads the elements
        }
        for(int i=0;i<array.length;i++)  
        {
            System.out.println(array[i]);  //prints the array elements
            sc.close();  //scanner close
        }

    }
}
