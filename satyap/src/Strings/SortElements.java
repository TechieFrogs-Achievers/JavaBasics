package Strings;
import java.util.*;

public class SortElements
{
    public static void main(String[] args)
    {
        //char ch[]={'s','a','t','y','a'};
       // String ch[]={"java","is","programming","language"};
       
       Scanner sc=new Scanner(System.in);
       System.out.println("Length:");
       int length=sc.nextInt();
       String ch[]=new String[length];
       
       for(int i=0;i<length;i++)
       {
            ch[i]=sc.next();
       }
        for(int i=0;i<length; i++)
        {
            for(int j=i+1;j<length;j++)
            {
                if(ch[i].compareTo(ch[j]) >0)
                {
                    String temp=ch[i];
                    ch[i]=ch[j];
                    ch[j]=temp;
                }
            }
        }
        System.out.println("In Lexicographical Order");
        for(int i=0;i<length;i++)
        {
            System.out.println(ch[i]);
        }
        
        sc.close();
    }
    
}
