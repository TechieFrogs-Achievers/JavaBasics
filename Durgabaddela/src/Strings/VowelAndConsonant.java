package Strings;

import java.util.Scanner;

public class VowelAndConsonant
{
  public static void main(String[] args)
  {
      System.out.println("enter the string");
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
    int vowels = 0, consonants =0;
    
    for (int i =0;i<=s.length()-1;i++)//for loop to get the characters in each  string
    {
        
        char ch = s.charAt(i);//for getting character at i value 

        if (Character.isLetter(s.charAt(i)))
        {
            
            ch = Character.toLowerCase(ch);//converting each letter to lowercase

            if(ch=='a' || ch =='e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                     vowels++;//vowels count increases
            }
            else 
            consonants++;//to increase the count
        }
        else {
            continue;
        }
    }
         System.out.println("the consonant count is ="+consonants);
        System.out.println("the vowel count is ="+vowels);
        sc.close();
        
  }  
  }
