package StringExercises2;

import java.util.Scanner;

public class StringPalindrome 
{
    public static void main(String[] args)
    {   
    
        System.out.println("Enter the string :");
        Scanner sc = new Scanner(System.in);//scanner class
        String str = sc.nextLine();// String variable
        String s1 =""; // empty string 
        for( int i = str.length()-1; i >= 0; i--)// lopp for checking  character
        {
            s1 =s1+str.charAt(i);
        }
        if(str.equals(s1))
        {
            System.out.println("Given string is pallindrome");// true
        }
        else
        {
            System.out.println(" Given string is not pallindrome");//false
        }
        sc.close();// closing scanner class


           
        
        
        
    }
    
}
