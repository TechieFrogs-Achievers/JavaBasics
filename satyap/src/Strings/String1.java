package Strings;
import java.util.*;
public class String1
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
       // String str2=sc.next();
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=' ')
            {
            count++;
            }
           
        }
        System.out.println("Total Number of characters in a string: "+count);
        sc.close();
    }
}
