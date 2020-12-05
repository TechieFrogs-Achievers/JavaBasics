package Strings;

import java.util.Scanner;

public class CharactersCount 
{
    public static void main(String[] args) 
    {
        int count = 0;
        System.out.println("enterthe string");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        for (int i =0;i<=s.length()-1;i++)//for loop to get the characters in each  string
        {
            
            //char ch = s.charAt(i);//for getting character at i value 
    
            if (Character.isLetter(s.charAt(i)))//checking the character or not
            {
                count++;//count is increased  
            }
            else
            {
               continue;
            }
        }
        System.out.println("the number of characters in a given string are="+count);
        sc.close();
    }
    
        
}
