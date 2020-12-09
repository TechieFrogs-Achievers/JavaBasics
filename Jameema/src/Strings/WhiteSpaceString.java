package Strings;

import java.util.Scanner;

public class WhiteSpaceString
 {
     public static void main(String[] args)
    {
        System.out.println("enter string:");
        Scanner sc = new Scanner(System.in);//sacnner class
        String str = sc.nextLine(); //input
        String str1 = sc.nextLine();
        System.out.println("the string is :" +str +"\n");
        str=str.replaceAll("\\s", ""); //replace method
        str1 = str1.replaceAll(str1.toLowerCase(), str1.toUpperCase()); //replacing upper case to lower case
        System.out.println("after removing white spaces:" +str+"\ne"); //removing whitespace
        System.out.println("after viceversa of string   : " +str1);
        sc.close();

         
     }
    
}
