package Strings;

import java.util.*;

public class StringExercise1
 {
     public static void main(String[] args) 
     {
         System.out.println("Enter the sentence:");   //enter the sentence
         Scanner s = new Scanner(System.in);  //scanner class
        String str =  s.nextLine();
        System.out.println("The length of sentence is:" +str.length());    //prints the length of the sentence
        s.close();
         
    }
    
}
