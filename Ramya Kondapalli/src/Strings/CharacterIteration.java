package Strings;

import java.util.Scanner;

public class CharacterIteration {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int length = 4;
        String s1[]  = new String [length]; //declaring empty array

        //user inputs using scanner classs
        for (int i =0;i<length;i++){
            s1[i] = s.next();
        }

        //printing array using for loop
        for(int i =0;i<length;i++){
            System.out.println("s"+ i + ":" + s1[i]);
        }

        //iteration through fpr each for s1 input 
        for (String x: s1){
            System.out.println( x);
        }

        String str = "Ramya Kondapalli";

        //iterating each character using for loop
        for (int i=0;i<=str.length()-1;i++){
            System.out.print(str.charAt(i)+" ");
        }

        System.out.println();

        String[] str1 = {"R","a","m","y","a"}; //string array

        //iterating each character using for each loop with string array
        for(String i:str1){
            System.out.print(i + " ");
        }

        char[] arr = {'R','a','m','y','a'};   //character array
        //Iteration each character in character array through for each loop
        for (char c: arr){
            System.out.print(c);
        }

    }
}
