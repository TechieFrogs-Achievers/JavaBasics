package Arrays;

import java.util.Scanner;

public class ArrayExample10 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the elements:");
        Scanner sc = new Scanner(System.in);   //scanner class object
        int length = sc.nextInt();   //integer creation
        int array[] = new int[length];  //initializing the array that stores the elements
        for(int i = 0;i < array.length;i++)   
        {
            array[i]=sc.nextInt();   //reads the elements
        }
        int smallnumber = array[0];
        for(int i=0; i < array.length; i++)   //loop that checks the array length 
        {
            if(array[i] < smallnumber)
            {
                smallnumber = array[i];
            }
        }
        System.out.println("smallest number is:"+smallnumber);   //prints the smallest number
        sc.close();   //scanner close
    }
        
    }
    

