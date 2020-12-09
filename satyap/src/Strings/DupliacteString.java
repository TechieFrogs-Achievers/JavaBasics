package Strings;
import java.util.*;
public class DupliacteString //class for printing dplication of string
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); //scanner class
        String str=sc.next();//string notation
       char[] str1=str.toCharArray(); // conversion of string to array
       int count=1; 
        for(int i=0;i<str.length();i++) //for loop for checking the empty or characters  
        {
            for(int j=i+1;j<str.length();j++)
            {
                
                if(str1[i]==str1[j] &&str1[i]!=' ')
                {
                    count++;
                    str1[j]='0';
                }
            }
            if(count>1 && str1[i]!='0')
            System.out.println(str1[i]);
        }
        sc.close(); //scanner close
    }
}
