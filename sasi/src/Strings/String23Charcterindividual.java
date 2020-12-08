package Strings;

import java.util.Scanner;

public class String23Charcterindividual 
{
    public static void main(String[] args) 
    {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    for(char c:s.toCharArray())
    {
        System.out.println(c+" ");
    }
    sc.close();
}
}
