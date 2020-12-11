package Strings;

import java.util.Scanner;

public class StringSubsets7 
{
    public static void main(String[] args) 
    {
        System.out.println(" Enter the string :");// string declaration
        Scanner sc = new Scanner( System.in);     //scanner class object
        String str = sc.nextLine();      // string creation 
        int length = str.length();        // variable for checking length of the string
        int temp=0;
         String Array[] = new String[length*(length+1)/2];   //checks the possibility of the length and stores the values

        for(int i=0; i < length;i++)// loop that checks the length of next char
        {
            for( int j = i; j< length; j++ )
            {
                Array[temp] = str.substring(i,j+1); // array that stores the subsets of string
                temp++;

            }

        }
        for ( int k =0 ; k < Array.length; k++) //for printing the subsets of string
        {
            System.out.println(" the subsets of  string :" + Array[k]);   //prints the array
        }  
        sc.close();    //scanner class
        
    }
    
}
