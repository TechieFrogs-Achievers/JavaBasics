package Strings;

import java.util.Scanner;

public class Subset 
{
    public static void main(String[] args)
     {
        System.out.println(" Enter the string :");// string declaration
        Scanner sc = new Scanner( System.in);//scanner class
        String str = sc.nextLine();// string variable
        int length = str.length();// variable for checking length of the string
        int temp=0;//
         String Array[] = new String[length*(length+1)/2];//checking total possibilities from given string by using this method

        for(int i=0; i < length;i++)// loop for checking the first character in string 
        {
            for( int j = i; j< length; j++ )// loop for checking next character for  subset and add into array 
            {
                Array[temp] = str.substring(i,j+1);// array storing the subsets of string
                temp++;

            }

        }
        for ( int k =0 ; k < Array.length; k++)// loop for printing all the subsets from the string
        {
            System.out.println(" the subsets of  string :" + Array[k]);
    }
    sc.close();
}
}
