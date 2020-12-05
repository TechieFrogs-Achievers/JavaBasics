package Strings;

import java.util.Scanner;

public class StringCount {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //counting no of chracters in a strings
        String s = sc.nextLine();
        int c=0,count=0;

        for (int i = 0;i<=s.length()-1;i++){ //loop for counting no of characters
            c++;
        }
        System.out.println("Number of characters : " + c);

        //counting no of words in a string
        String words = sc.nextLine();

        String[] wordsarr= words.split(" "); //splitting sentence into words
        
        for (String ch:wordsarr){//loop for counting no of 
            count++;
        }
        System.out.println("No of words : " + count);  
        
    }
}
