package Strings;

import java.util.Scanner;

public class ReplaceWithChar 
{
    public static void main(String[] args)
     {
    //String s ="Techi Frogs Achievers";
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String s1=s.replace(" ","@");//replace method to replace special character
    System.out.println(s1);
    String s2=s.replace(" ","$");
    System.out.println("after replacement="+s2);
    sc.close();

    

    }
}
