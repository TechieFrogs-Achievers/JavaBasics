package Strings;

import java.util.Scanner;

public class StringExercise15 
{
    public static void main(String[] args) 
    {
        System.out.println("enter the sentence");
        Scanner sc = new Scanner(System.in); //scanner class
        String str = sc.nextLine();
        String[] word = str.split(" "); //split method
        String words = ""; //empty string
        for(int i = 0;i<word.length;i++)
        {
            words =words +  Character.toUpperCase(word[i].charAt(0)) + word[i].substring(1) +" "; //it takes everyword in the sentance first letter is uppercase
        }
        System.out.println(words);
        sc.close();
    }
    
}
