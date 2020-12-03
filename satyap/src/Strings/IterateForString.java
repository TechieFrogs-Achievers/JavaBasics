package Strings;
import java.util.*;
public class IterateForString 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char[] ch=str.toCharArray();
        for(int i=0;i<5;i++)
        {
            
             System.out.println(ch[i]);
        }
        sc.close();
    }
}
