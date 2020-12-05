package Strings;

import java.util.Scanner;

public class StringsExample5 
{
    public static void main(String[] args) 
    {   Scanner sc = new Scanner("java hello");//creting a string by scanner
        String s = sc.next();
        String r = sc.next();
        //String r = "java";
        System.out.println(s==r);
        System.out.println(s.equals(r));

        String s1 = new String("Durga");//creating an object for s1
        String s2 = new String("Durga");//creating object for string s2
        System.out.println(s1==s2);//returns false
        String s3 = new String("Hai");
        String s4 = new String("hai");
        System.out.println(s3==s4);//checking by using references
        System.out.println(s1.equals(s2));//checking by values in the string
        sc.close();
        
    }
}
