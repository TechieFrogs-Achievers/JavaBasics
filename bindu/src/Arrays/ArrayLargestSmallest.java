package Arrays;

import java.util.Scanner;

public class ArrayLargestSmallest 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);   //scanner class object
        int val = sc.nextInt();   //integer creation 
        int arr[]= new int[val];    //initilaizing the array that stores the elements 
        for(int i=0;i<arr.length;i++)
        {
            arr[i]= sc.nextInt();   //reads the elements
        }     
        for(int i=0;i<arr.length;i++)   //checks the condition and prints the array length and position 
        {  
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]>arr[j])   //if array1 greater than array2 then the swapping starts
                {
                    int temp =arr[i];   // to the swap the elements using the 3rd variable temp to store the values 
                    arr[i]=arr[j];
                    arr[j]=temp;
                    
                }
            }
        }
        System.out.println("The 3rd largest number in an array is:"+arr[arr.length-3]);  //prints the 3rd largest number
        System.out.println("The 2nd largest number in an array is:"+arr[arr.length-2]);  //here the condition is that checks the largest number and from the array it will minus from the length
        sc.close();   //scanner close
    } 
       
}
