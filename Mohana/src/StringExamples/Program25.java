package StringExamples;

import java.util.Scanner;

public class Program25 
{
    public static void main(String[] args) 
    {
        int countv = 0,countc=0;
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();//taking input from keyboard

        String s1 = str.toLowerCase();//total string into lower case letters 
       
        for(int i = 0;i <= s1.length()-1;i++)
        { 

            char ch = s1.charAt(i);//string value given to char

             
            if(ch ==   'a'  || ch == 'e' || ch == 'i' ||  ch =='o' || ch == 'u') //to check vowels
            {
                countv++;
            }
            else if( ((ch >= 'a')&& (ch <= 'z')))//condition to check consonants
            {
                countc++;
            }
 
        }
        System.out.println("Total noof voewls : " +countv);
        System.out.println("Total no of consonents : " +countc);
        sc.close();
        
    }
    
}
