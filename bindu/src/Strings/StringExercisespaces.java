package Strings;

import java.util.Scanner;

public class StringExercisespaces 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the string:");
        Scanner sc = new Scanner(System.in);    //scanner class object
        String str = sc.nextLine();
        str=str.replaceAll("\\s","");    //remove the space 
        System.out.println("After replacing all the whitespaces:"+str);  //prints the combined string
        sc.close();

        
    }
    
}
