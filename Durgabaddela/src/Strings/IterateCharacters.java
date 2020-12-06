package Strings;

import java.util.Scanner;

public class IterateCharacters
{ 
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the string");
    String s = sc.nextLine();
    for(int i=0; i<=s.length()-1; i++)
    {
        System.out.print(s.charAt(i)+" ");
    }
    sc.close();
    }
}
