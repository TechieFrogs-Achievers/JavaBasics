package Strings;

import java.util.Scanner;

public class StringExample1 
{
    
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String s1 = sc.nextLine();
    public void Length()
    {   
        System.out.println("the length of string : "+s.length());
    }
    public void stringsLength()
    {
        String sl = s+s1;
        System.out.println("concatination of two strings  :"+sl);
        System.out.println("the length of two strings:  "+sl.length());
    }
    public static void main(String[] args) 
    {
        System.out.println("enter string");
        StringExample1 sobj = new StringExample1();
        sobj.Length();
        sobj.stringsLength();
        
        
    }
    
}
