package Strings;

import java.util.Scanner;

public class StringExercisecount1 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the number of char:");
        Scanner sc = new Scanner(System.in);   //scanner class object
        String s=sc.nextLine();
        int count =0;    //to check the no.of characters
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ') //checks the characters  
            {
                count++;
            }
        }
        System.out.println("Count of total characters are:"+count);

        sc.close();   //scanner close
    }
    
}
