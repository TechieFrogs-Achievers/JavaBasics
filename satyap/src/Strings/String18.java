package Strings;
import java.util.*;
public class String18  //class for string duplication
{
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        //String str="jam is jam";
        int count;
        str=str.toLowerCase();
        String words[]=str.split("");// spliting the string into tokens
        for(int i=0;i<words.length;i++)
        {
           count=1;
           for(int j=i+1;j<words.length;j++)
           {
               if(words[i].equals(words[j]))
               {
                   count++;
                   words[j]="0";
               }
               
            }
            if(count>1 && words[i]!="0")
            {
               System.out.print(words[i]);
            }
        }  
        sc.close();//scanner close
    }
}

