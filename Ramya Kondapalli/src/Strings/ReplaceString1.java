package Strings;

import java.util.Scanner;

//replacing string with speacial character
public class ReplaceString1 {
    public static void main(String[] args) {

        String s = "Ramya kondapalli";
        //replacing all "a"'s with "@"'
        System.out.println(s.replaceAll("a", "@"));

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        //replacing all "is" with "IS"
        System.out.println(str.replaceAll("is", "IS"));
    }
}
