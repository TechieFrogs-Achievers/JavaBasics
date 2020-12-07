package Strings;

import java.util.Scanner;

public class DuplicateCharacters
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);//creating scanner obj
        System.out.println("enter the string");
        String s = sc.nextLine();//taking string input
        int count = 0;
        char[] str = s.toCharArray();//converting string into char array

        System.out.println(s);
       for(int i = 0 ; i<=str.length-1;i++) 
       {
           for(int j = i+1; j <= str.length-1;j++)
           {  
               if(str[i] == str[j])//condition to check if both are equal or not
               {
                   System.out.println(str[j]);
                   count++;
                   break;
               }
               
           }   
       }
       System.out.println("the number of times of duplicate character ="+count);
       sc.close();
    }
}
