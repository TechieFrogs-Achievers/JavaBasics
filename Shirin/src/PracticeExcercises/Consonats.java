package PracticeExcercises;

import java.util.Scanner;

public class Consonats 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);     //scanner class
        System.out.println("Enter the String :");
        String str = sc.nextLine(); 
        int count =0;      // method for giving input from user
        /*for( int i =0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if((ch=='a' || ch =='e' || ch =='i' || ch=='o' || ch =='u') &&( ch=='A' || ch =='E' || ch =='I' || ch=='O' || ch =='U') )
            {
                count++;

            }
            else
            {
                System.out.println(ch);
            }
        }
        System.out.println(count);
        sc.close();*/
        for( int i =0; i < str.length()-1; i++)
        {
            char c = str.charAt(i);
            char ch1 = Character.toLowerCase(c);     // every string convert to lower case
            char c1 = str.charAt(i);
            char ch2 = Character.toLowerCase(c1);     // this method for  printing the consonats after vowels


            if((ch1=='a' || ch1 =='e' || ch1 =='i' || ch1=='o' || ch1 =='u') &&( ch2!='a' || ch2 !='e' || ch2 !='i' || ch2 !='o' || ch2 !='u') )
            {
                count++;
            }
        
        }
        System.out.println("consonats count : " + count);
        sc.close();
        
    }
    
}
