package StringExamples;

import java.util.Scanner;

public class Program19 
{
    public static void main(String[] args) 
    {  
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        if(s1.contains(s2))
        {
            System.out.println("both string contain this word " +s2);
        } 
        else
        {
            System.out.println("s1 is not a sub string of s2");
        }  
        sc.close();
        
    }
    
}
