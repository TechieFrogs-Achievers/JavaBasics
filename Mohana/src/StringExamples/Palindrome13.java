package StringExamples;

import java.util.Scanner;

public class Palindrome13
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String word=sc.next();
        String str = new StringBuffer(word).reverse().toString();//method to reverse the string
        if(word.equalsIgnoreCase(str))//checks the palindrome condition
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("No a palindrome");
        }
        sc.close();
        
    }
    
}
