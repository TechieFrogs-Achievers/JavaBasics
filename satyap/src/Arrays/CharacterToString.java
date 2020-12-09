package Arrays;
import java.util.*;
public class CharacterToString 
{
   public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
       int length=sc.nextInt();
     char ch[]=new char[length];
     for(int i=0;i<length;i++)
     {
       
       String s=String.valueOf(ch);
       System.out.println(s);
     }
     String str=sc.next();
     for(int i=0;i<length;i++)
     {
       ch[i]=str.charAt(i);
     }
     for(int i=0;i<length;i++)
     {
       System.out.print(ch[i]+" ");
     }
     sc.close();
   }   
}
