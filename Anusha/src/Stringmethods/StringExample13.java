package Stringmethods;
import java.util.*;
public class StringExample13 
{
   public static void main(String[] args)
    {
        String str1 = "";
        Scanner sc = new Scanner(System.in);//scanner class
        System.out.println("Enter any String : ");
        String str = sc.nextLine();
        String temp = str ;//str value stored in temp
        //check palindrome or not
        for(int i = str.length()-1 ;  i >= 0 ; i--)
        {
            str1 = str1 + str.charAt(i);
        }
        System.out.println(str1.equals(temp)?"Palindrome" : "Not Palindrome");
        sc.close();

   } 
}
