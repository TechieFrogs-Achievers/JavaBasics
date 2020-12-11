package Strings;

import java.util.Scanner;

public class String23Charcterindividual 
{
    public static void main(String[] args) 
    {
    Scanner sc=new Scanner(System.in); //input
    String s=sc.nextLine(); // read  arr
    for(char c:s.toCharArray()) //charstores into arr
    {
        System.out.println(c+" ");
    }
    sc.close();
}
}
