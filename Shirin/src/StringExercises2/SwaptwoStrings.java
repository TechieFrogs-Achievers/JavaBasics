package StringExercises2;

import java.util.Scanner;

public class SwaptwoStrings 
{
    public static void main(String[] args) 
    {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter the String1");
        String str1 = sc.nextLine();
        System.out.println("enter the string2 ");
        String str2 = sc.nextLine();
        System.out.println("Before swap :" +str1+ " " +str2);
        str1 = str1+str2;//two strings
        str2 =str1.substring(0,(str1.length()-str2.length()));//checking 
        str1 =str1.substring(str2.length());
        System.out.println("After swap :" +str1 + " " +str2);
        sc.close();

        
    }

    
}
