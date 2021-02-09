package Strings;

import java.util.Scanner;

public class SubstringUsingContains {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string");
        String str = sc.nextLine(); 

        System.out.println("Enter the substring");
        String subString = sc.nextLine(); 

        subString = subString.toLowerCase();

        //System.out.println(str.contains(subString)); //if string contains substring it returs true
        
    }
}
