package ArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateProgram21 
{
    public static void main(String[] args) 
    {
        System.out.println("enter length of array : ");
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt(); //taking length of an array
        int arr1[] = new int[l];//creating an array

        for(int i =0; i <l ;i++)//loop to iterate upto length 
        {
            arr1[i] = sc.nextInt(); //taking values from keyboard
        }
        System.out.println("array elemnents are : " +Arrays.toString(arr1));//converting values into array 

        for(int i = 0 ;i < arr1.length; i++)
        {
            for(int j = 0; j <=arr1.length; j++)
            {
                if(arr1[i] == arr1[j])
                {
                   // arr1= ArrayUtils.remove(arr1,j); 
                }
            }
        }
    }
    
}
