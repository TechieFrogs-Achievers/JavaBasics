package Strings;

import java.util.Scanner;

public class Substring
 {
    public static void main(String[] args) 
    {
        //String s="sasi bhanu";
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1=sc.next();
       
       // String string2[]=s.substring(0);
       // int length;

       System.out.println(s.indexOf('s'));
        System.out.println(s.compareTo(s1));
        
        sc.close();
    }
}
