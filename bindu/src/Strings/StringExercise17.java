package Strings;

import java.util.Scanner;

public class StringExercise17 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  //scanner class object
        String str = sc.nextLine();
        for(int i=0;i<str.length();i++)    //for loop 
        {
            char ch =str.charAt(i);  //checks the character of the string 
            System.out.print(ch+" ,");   //prints the chars
        }
        sc.close();   //scanner close
    }
    
}
