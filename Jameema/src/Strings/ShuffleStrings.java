package Strings;

import java.util.Scanner;

public class ShuffleStrings 
{
    private static boolean checkShuffleString(String str1, String str2, String FinalStr) //parameterised method
    {
        int i = 0, j = 0, k = 0; //datamembers
        if (str1.length() + str2.length() != FinalStr.length()) 
        {
         return false; //return vale
        }
        while (k < FinalStr.length()) //checking the condition
        {
            if (i < str1.length() && str1.charAt(i) == FinalStr.charAt(k)) 
            {
                i++;
            } 
            else if (j < str2.length() && str2.charAt(j) == FinalStr.charAt(k)) 
            {
                j++; //increament the value
            } 
            else 
            {
                return false;
            }
            k++;
        }
        if (!(i == str1.length() && j == str2.length() && k == FinalStr.length()))
        {
            return false;
        }
        return true;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); //scanner class
        String str1 = sc.nextLine();
        String str2 = sc.nextLine(); //console input
        String str3 = sc.nextLine();
        System.out.println("The final string is: " + str3);
        System.out.println("The different strings are " + str1 + " and " + str2); 
        System.out.println("The given string is interleaving: " + checkShuffleString(str1, str2, str3)); //ptints the result
        sc.close();
        
    }
    
}
