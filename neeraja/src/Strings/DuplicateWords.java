package Strings;

import java.util.Scanner;

public class DuplicateWords {
    public static void main(String[] ij){

    Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String[] words = sentence.split(" "); //dividing string at spaces
        int count = 0 ;

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
        sc.close();
    }
}

    

