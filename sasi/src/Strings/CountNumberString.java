package Strings;

import java.util.Scanner;

public class CountNumberString 
{
    public static void main(String[] args) 
    {
    Scanner sc=new Scanner(System.in); //input scanner class 
    String str=sc.nextLine(); //scanner class 
    int vowels=0, consonants=0, digits=0, spaces=0;

        str= str.toLowerCase(); // covertion string lower
        for(int i = 0; i < str.length(); ++i)
        {
            char ch = str.charAt(i); // it gives the index value string divides into charcter
            if(ch == 'a' || ch == 'e' || ch == 'i' //condition for vowles
                || ch == 'o' || ch == 'u') 
                {
                  vowels++;
            }
            else if((ch >= 'a'&& ch <= 'z')) //cond for consonents
            {
                consonants++;
            }
            else if( ch >= '0' && ch <= '9') // cond for digits
            {
                digits++;
            }
            else if (ch ==' ') //cond for space
            {
                spaces++;
            }
            else 
            {
                System.out.println("specialcharcters:invaild");
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("White spaces: " + spaces);
        sc.close();
    }
}
    

