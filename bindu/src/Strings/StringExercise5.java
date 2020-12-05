package Strings;

import java.util.Scanner;

public class StringExercise5 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);    //scanner class
        String str ="HIMABINDU";
        String str1="himaBindu";
        String str2="HIMABINDU";
        String str3="himaBindu";
        System.out.println(str.equals(str2));   //prints the true operation
        if(str.equals(str3))    //prints value if true
        {
            System.out.println("prints the strings are equal:");
        }
        else if(str1.equals(str3))   
        {
            System.out.println("prints that strings have same name:");
        }
        else
        {
            System.out.println("strings are not involved in it:");   //prints operation if all false
        }
        sc.close();   //scanner close
    }
    
}
