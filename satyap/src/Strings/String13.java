package Strings;
import java.util.*;
public class String13 //class for string palindrome
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); //scanner class
        String str=sc.next(); //string notations
        String rev="";
        str=str.toLowerCase();
        for(int i=str.length()-1;i>=0;i--) //for loop for string to characters 
        {
            char str1=str.charAt(i);
            rev=rev+str1;
        }
        if(str.equals(rev)) //if str is rev the given string is palindrome 
        {
             System.out.println(str+" is a palindrome");
        }
        else{ // else string is not palindrome
            System.out.println(str+" is not a palindrome ");
        }
        sc.close(); //scanner close
    }
}
