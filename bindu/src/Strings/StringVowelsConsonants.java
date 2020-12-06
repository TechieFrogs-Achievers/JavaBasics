package Strings;

import java.util.Scanner;

public class StringVowelsConsonants 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //scanner class object
        String str = sc.nextLine();
        int vowels=0;
        int consonants =0;
        for(int i=0;i<str.length();i++)   //CHECKS the length of the string
        {
            if(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
                vowels++;   //checks the condition for vowels
         else if (str.charAt(i)>='A'&& str.charAt(i)<='Z')   
                {
                    consonants++; 
                }
        }
            System.out.println("count of vowels are:"+vowels);  //prints the vowels
            System.out.println("count of consonants are:"+consonants);
            sc.close();
        }
    

    }
    

