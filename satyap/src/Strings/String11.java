package Strings;
import java.util.*;
public class String11 
{
    public static void main(String[] args) 
    {
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      StringBuffer sb=new StringBuffer(str);
      
      for(int i=0;i<str.length();i++)
      {
        char str1=str.charAt(i);
        if(Character.isLowerCase(str1))
        {
            sb.setCharAt(i,Character.toUpperCase(str1));
        }
        else if(Character.isUpperCase(str1))
        {
            sb.setCharAt(i,Character.toLowerCase(str1));
        }
      }
      System.out.println("Converting String :"+sb); 
      sc.close();
    }

    
}
