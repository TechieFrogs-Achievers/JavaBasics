package Strings;

import java.util.Scanner;

public class StringExercise18 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   //scanner class object
        String str = sc.nextLine();
        for(char ch:str.toCharArray())   //for each loop 
        {
            System.out.print(ch+",");  //prints the char
        }
        sc.close();   //scanner close
    }
    
}
