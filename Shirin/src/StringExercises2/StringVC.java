package StringExercises2;

import java.util.Scanner;

public class StringVC 
{
    public static void main(String[] args) 
    {
       System.out.println("Enter the string :");
       Scanner sc = new Scanner(System.in);//scanner class
       String str = sc.nextLine();
       int vowels=0 , consonants =0;
       for(int i= 0;i < str.length();i++)
       {
           if(str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'||str.charAt(i)=='u')// it checks vowels 
           vowels++;
       
                else if(str.charAt(i)>='a'&& str.charAt(i)<='z')//it checks consonants
                {
                    consonants++;

                }       
       } 
       System.out.println(" the number of vowels :" + vowels);// it prints vowel count
       System.out.println(" the number of consonats : " +consonants);// it prints consonants count 
       sc.close();   
    }
    
    
    
    
}
