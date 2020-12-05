package Strings;

//import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//import javax.lang.model.util.ElementScanner14;

public class StringExercise9
 {
     public static void main(String[] args)
      {
          System.out.println("enter first string "); //enter string
          Scanner sc = new Scanner(System.in); //scanner class
          String s1=sc.nextLine();
          System.out.println("enter second String");
          String s2=sc.nextLine();
          if(s1.length()==s2.length()) //both stringlenghts are equal
          {
              char[] Firstwrd = s1.toCharArray(); //dividing string as characters
              char[] Secondwrd = s2.toCharArray();
              Arrays.sort(Firstwrd);
              Arrays.sort(Secondwrd); //sorting the characters
              boolean result = Arrays.equals(Firstwrd, Secondwrd); //comparing two strings
              if(result)
              {
                  System.out.println(s1 + " and " + s2 + " are anagram"); // if condition is true
              }
              else
              {
                System.out.println(s1 + " and " + s2 + " are not anagram"); //is condition is false

              }

            }
            else 
            {
               System.out.println(s1 + " and " + s2 + " are not anagram"); //if string lengths are not equal
            }
            sc.close();
     }
    
}
