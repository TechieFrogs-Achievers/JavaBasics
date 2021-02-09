package Arrays;

import java.util.Scanner;

public class ArrayExample3 
{
    public static void main(String[] args) 
    {
        System.out.println("enter the elements:");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();    //initializing the integer length
        int arr[] = new int[length]; //initializing the array to store the elements
        //int position = sc.nextInt();
        //loop that checks the length and reads the elements
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();   //reads the elements
        }
            int position =sc.nextInt();   //position to the number of elements

        int temp;  //takes the temporary variables
        for(int i=0;i<position;i++)
        {
            temp = arr[0];  //assigns the value to the 1st array element
            
            for(int j=0;j<arr.length-1;j++)
            {
            arr[j] = arr[j+1];     //change the position of an array
            }
            arr[arr.length-1] = temp;    //length of the array is equal to temp value 
        }
         System.out.println("elements of left shift:");   //prints the result
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
            sc.close();   //scanner close

    }

}
