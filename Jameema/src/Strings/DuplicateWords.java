package Strings;

import java.util.Scanner;

public class DuplicateWords 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the string :");
        Scanner sc = new Scanner(System.in);
        String str =  sc.nextLine();
        int count;
        String word[] = str.split(" ");// it separate the words from given string and stores into array
        for( int i =0; i <= word.length; i++)//  check the first  word in given string 
        {
            count =1;
            for( int j = i+1; j < word.length;j++ )// check the second array in given string 
            {
                
                if( word[i].equals(word[j]))// if two strings are equal 
                {
                    count++;// count will be increase
                    word[j] ="0"; //second word become zero

                }
            }
            if(count > 1  && word[i] != "0")// if the word repeats greater than one
            {
                System.out.println(word[i] + " " +count);// printing number of duplicate words

            }
            
        }
        sc.close();
        
    }
    
}
