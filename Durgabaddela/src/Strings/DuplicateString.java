package Strings;

import java.util.Scanner;

public class DuplicateString 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String[] words = sentence.split(" "); //converting string into string array
        int count =0;

        for(int i = 0; i <=words.length-1; i++ )
        {
            for(int j = i+1; j <= words.length-1; j++)
            {
                if(words[i]. equals (words[j]) )//condition to check words are equal or not
                {
                    System.out.println(words[j]);
                    count++;
                }
            }
        }
        System.out.println("the nuber of duplicate strings ="+count);
        sc.close();
    }
}
