package Strings;
import java.util.*;

public class Stringbufferr 
{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
         StringBuffer sb = new StringBuffer();
         String s=sc.nextLine();
         sb.append("bhanu"); //adding two strings
         sb.append(s);
         System.out.println(s);
         sb.reverse(); //reverse of a string
         System.out.println(s);
         sb.delete(2,4); //delete the string
         System.out.println(sb);
        sb.insert(1,'a'); // insert a string
         System.out.println(sb);
         sb.setLength(4); // length of a string
         System.out.println(sb);
         sb=new StringBuffer();//creating new string
        System.out.println(sb);
         sc.close();
        
    }
}
