package PracticeExcercises;

import java.util.Scanner;

public class SpecialSymblols 
{
    public static void main(String[] args) 
    {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.nextLine();  // method for giving input 
        int count =0,count1=0,count2=0,count3=0;
        for( int i = 0; i < str.length(); i++)
        {
            char c = str.charAt(i);
            if(c >='A' && c <= 'Z' )
            {
            count1++;
            }
            else if(c >= 'a' && c <= 'z')
            {
                count2++;
            }
            else if(c >='0' && c <= '9')
            {
                count3++;
            }
            else
             count++;
        
        }
        System.out.println(count);*/

        Scanner sc = new Scanner(System.in);    //creating scanner object

        System.out.println("Enter String");
        String str = sc.nextLine();         //reading input from the user 
        
        //initializing data members with zero
        
        int count = 0;

        //for loop to check each character

        for( int i = 0 ;i < str.length() ; i++ ) 
        {
            char ch = str.charAt(i);       //Extracting every character from string

            char ch1 = Character.toLowerCase(ch);   //converting the character into lowercase letters if the any letter in upper inthe given string

            //condition to check the numbers and characters

            if((ch1 >= 'a' && ch1 <= 'z') || (ch1 >='0' && ch1 <= '9'))
            {
                continue;
            }
            else
            {
                count++;
            }
         
    }
    
    //printing the number of special characters

    System.out.println(count);
    sc.close();

        
    }
    
}
