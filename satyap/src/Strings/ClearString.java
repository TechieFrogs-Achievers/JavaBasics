package Strings;
import java.util.*;
public class ClearString //class for clear the string
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); //scanner class
        String str=sc.next();
        StringBuffer sb=new StringBuffer(str); //string buffer class
        System.out.println(sb.append("is")); //appending the string using buffer class
        System.out.println(sb.append("good"));
        System.out.println("StringBuffer:"+str); //printing string
        sb.delete(0,str.length()); //clearing the string by using delete keyword
        System.out.println("Updated StringBuffer:"+str);
        sc.close(); //scanner close
    }
}
