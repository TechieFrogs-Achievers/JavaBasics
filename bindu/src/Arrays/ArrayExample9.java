package Arrays;

import java.util.Scanner;

public class ArrayExample9 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the elements:");
        Scanner sc = new Scanner(System.in);   //scanner class object
        int length = sc.nextInt();   //integer creation
        int array[] = new int[length];  //initializing the array that stores the elements
        for(int i=0;i<array.length;i++)   
        {
            array[i]=sc.nextInt();   //reads the elements
        }
        int largenumber = array[0];
        for(int i=0; i<array.length; i++)   //loop that checks the array length 
        {
            if( array[i] > largenumber )
            {
                largenumber = array[i];
            }
        }
        System.out.println("largest number is:"+largenumber);   //prints the largest number
        sc.close();   //scanner close
    }
    
}
