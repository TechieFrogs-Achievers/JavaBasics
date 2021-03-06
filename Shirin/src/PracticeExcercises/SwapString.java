package PracticeExcercises;

import java.util.Scanner;

public class SwapString 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);     // scanner class
        System.out.println("Enter the String :");
        String str1 = sc.nextLine();    // input taking from user
        System.out.println("Enter the another string");
        String str2 = sc.nextLine();
        String temp;
        System.out.println("Before Swapping :");
        System.out.println(" String 1= " +str1);
        System.out.println(" String 2= " +str2);
         
        temp = str1;
        str1 = str2;
        str2 = temp;
        System.out.println("Aftre swapping the string :");
        System.out.println(" String 1 " +str1);
        System.out.println(" String 1 " +str2);
        sc.close();
        
        

        
    }
    
}
