package Arrays;

import java.util.Scanner;

public class ArrayExample11 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the elements:");
        Scanner sc = new Scanner(System.in);   //scanner class object
        int length = sc.nextInt();  //integer creation 
        int arr[]=new int[length];   //stores the array elements
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();   //reads the array elements
        }
        System.out.println(arr.length+" ");  //prints the array length
        sc.close(); //scanner close
    } 
    
}
