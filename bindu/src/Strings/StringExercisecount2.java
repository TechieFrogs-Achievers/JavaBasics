package Strings;

import java.util.Scanner;

public class StringExercisecount2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);    //scanner class object
        String s="TECHIEFROGS";     //first string
        System.out.println("The string is: "+s);  //prints the first string
        System.out.println("enter the second string:");    
        String s1 = sc.nextLine();    //string 2
        int count =0;
        for(int i =0;i<s1.length();i++)   //checks the string length
        {
            if(s1.charAt(i)!=' ') //checks the characters  
            {
                count++;
            }
       
        }
                
        System.out.println("the count of second string is: "+count);   //prints the count of second string
        sc.close();   //scanner close


    }
        
}
