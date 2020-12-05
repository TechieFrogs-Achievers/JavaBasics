package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagrams 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the first name:");
        Scanner sc = new Scanner(System.in);    //scanner class
        String s = sc.nextLine();      
        System.out.println("Enter the second name:");
        String s1= sc.nextLine();     
        if(s.length()==s1.length())    //equals the two strings
        {
            char[] firstname = s.toCharArray();    //setting the character array 
            char[] secondname = s1.toCharArray();
            Arrays.sort(firstname);   //sorting the array elements
            Arrays.sort(secondname);
            boolean result = Arrays.equals(firstname,secondname);    //checks the boolean values of the array 
            if(result)
            {
                System.out.println(s +"&"+s1+"are Anagrams:");   //prints the result
            } 
            else
            {
                System.out.println(s+"&"+s1+"are not Anagrams:");
            }
        }
            else
            {
                System.out.println(s+"&"+s1+"are not pairs of Anagrams:");  //prints the value when it is false
            }
            sc.close();   //scanner close
        }
    }
    

