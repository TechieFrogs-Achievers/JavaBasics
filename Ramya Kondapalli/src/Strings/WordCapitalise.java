package Strings;

import java.util.Scanner;

public class WordCapitalise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();

        String words[]=str.split(" ");  //split the string with spaces

        String finalWord="";  //empty string 

        for(String w:words){  

        String firstLetter=w.substring(0,1);  //making first letter capital

        String remainingLetters=w.substring(1);   //extract remaining letters except firstletter
        
        finalWord+=firstLetter.toUpperCase()+remainingLetters+" ";  //adding both firstletter and remaining letters
    }  
        System.out.println(finalWord);

        /*Scanner s = new Scanner(System.in);

        String str = s.nextLine();

        String words[] = str.split(" ");
        System.out.println(words);*/

        /*for (int i =0;i<str.length()-1;i++){

            String capital = words[i];

            String firstLetter = capital.substring(0,1);
            String remainingLetter = capital.substring(1);
            String total = firstLetter+remainingLetter;

            words[i] = words[i].replace(words[i], total);
        }

            for(int i=0;i<str.length()-1;i++){
                System.out.println(words[i]);
        }*/

    }
}
