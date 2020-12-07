package StringExamples;

import java.util.Scanner;

public class SpecialCharactersPrgm12
{
    public static void main(String[] args) 
    {
        
    Scanner sc = new Scanner(System.in);
    String word = sc.nextLine();
    String s1=word.replace(" ","@");//it replaces all the spaces with special character
    System.out.println(s1);
    String s2=word.replace(" ","$");
    System.out.println("after replacement="+s2);
    sc.close(); 
    }
    
}
