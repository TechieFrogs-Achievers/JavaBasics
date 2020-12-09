package Strings;
import java.util.*;
public class String14 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        if(str1.length()!=str2.length())
        {
            System.out.println("Second string is not a rotation of first string");
        }
        else{
            str1=str1.concat(str1);
        }
        if(str1.indexOf(str2)!=-1)
        {
            System.out.println("Second string is rotation of first string");
        }
        else{
            System.out.println("Second string is not a rotation of first string");
        }
        sc.close();
    }
}
