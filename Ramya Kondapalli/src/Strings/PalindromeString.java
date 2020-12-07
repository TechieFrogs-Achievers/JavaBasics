package Strings;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        String temp = str;
        String sc = "";

        for (int i=str.length()-1;i>=0;i--){
            char c = str.charAt(i);
            sc = sc+ c;
        }

        if (temp .equals(sc)){
            System.out.println("string is palindrome");
        }
        else
            System.out.println("String is not palindrome");

        s.close();
    }
}
