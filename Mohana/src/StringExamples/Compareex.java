package StringExamples;

import java.util.Scanner;

public class Compareex 
{
    public static void main(String[] args) {
        
        String s1 = "Mohana";
        String s2 = "Mohana";
        String s3 = "Kemisetti";
        String s = new String("KEMISETTI");
        System.out.println(s1.compareTo(s2));//it returns 0 because s1-s2 
        System.out.println(s1.compareTo(s3));//it returns 2 because 13-11
        System.out.println(s3.compareTo(s));//it returns 32 

        Scanner sc = new Scanner("java programming");
        String s5 = sc.next();
        String s6 = sc.next();
        String  s4 = new String("javaa");
        System.out.println(s5.compareTo(s4));
        System.out.println(s6);
        sc.close();

    }
}
