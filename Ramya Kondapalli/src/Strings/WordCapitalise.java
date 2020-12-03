package Strings;

import java.util.Scanner;

public class WordCapitalise {
    public static void main(String[] args)throws ArrayIndexOutOfBoundsException {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();

        String words[]=str.split(" ");  

        String finalWord="";  

        for(String w:words){  

        String firstLetter=w.substring(0,1);  
        String remainingLetters=w.substring(1);  
        finalWord+=firstLetter.toUpperCase()+remainingLetters+" ";  
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
