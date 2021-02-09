package PracticeExcercises;

import java.util.Scanner;

public class ReverseString 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);   // scanner class
        String str = sc.nextLine();
        String reverse = " ";
        //int length = str.length()
        for( int i = str.length()-1 ; i >= 0; i--)
        {
             reverse = reverse + str.charAt(i);
        }
        System.out.println("After reverse the string " + reverse);
        sc.close();
    
        
    }
    
}
