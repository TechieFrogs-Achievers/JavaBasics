package Strings;

import java.util.Scanner;

public class Stringreplace
 {
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        String s= sc.next();
        //char ch[];
        s=s.replace(" bhanu","");
        System.out.println("after removing whitespaces:"+s);
        sc.close();
    }
}
