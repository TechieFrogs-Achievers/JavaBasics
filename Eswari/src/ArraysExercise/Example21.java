package ArraysExercise;

import java.util.Scanner;

//class to remove duplicate elements in an arry
public class Example21 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);                  //scanner class for taking input from user
        int length = scan.nextInt();                    //taking array length from user
        int array[] = new int[length];                  //creating array
        //loop for reading array elements from console
        for(int i = 0; i < array.length;i++)
        {
            //reading array elements
            array[i] = scan.nextInt();
        }
        //loop for taking first element from array
        for(int i = 0; i < length;i++)
        {
            //loop for taking next element from array
            for(int j = i + 1; j < length; )
            {
                //checking two elements (if two elements are same then duplicates are there)
                if(array[i] == array[j])
                {
                    //loop for removing duplicate elements in an array
                    for(int k = j; k < length -1; k++)
                    {
                        //that duplicate element is replace with next element of an array
                        array[k] = array[k+1];
                    }
                    //length is decremented because the duplicate element is removed then array length is decreased so lengthis decrement
                    length = length -1;
                }
                //if two elements are not same then move to next element
                else
                {
                    j++;
                }    
            }
            
        }
        //loop for printing arrays elements without duplicate elements
        System.out.print("The array elements in array without duplicates are : ");
        for(int i = 0; i < length; i++)
        {
            //printing array elements
            System.out.print(array[i] +" ");
        }
        scan.close();        //scanner close
    }
}
