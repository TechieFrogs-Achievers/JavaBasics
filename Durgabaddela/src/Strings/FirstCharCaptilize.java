package Strings;

import java.util.Scanner;

public class FirstCharCaptilize 
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();
       String word[] = s.split("");
       String totalString = "";

       for(String i:word)
       {
           String firstWords = i.substring(0,1);
           String otherWords = i.substring(1);
           totalString = firstWords.toUpperCase() +otherWords+" ";//converting first letter into captial word 
       }
       System.out.println(totalString);
       sc.close();

    }
}
