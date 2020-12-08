package StringExercises2;

import java.util.Scanner;

public class StringWhitespace 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the string :");
        Scanner sc = new Scanner(System.in);//scanner class
        String str = sc.nextLine();
        str = str.replaceAll("\\s", "");//method for removing whitespaces from given string
        System.out.println(" after removing white space :" +str);
        sc.close();

        
    }
    
}
