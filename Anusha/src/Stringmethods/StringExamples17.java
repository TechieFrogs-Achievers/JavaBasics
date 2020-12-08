package Stringmethods;
import java.util.*;
public class StringExamples17 
{
   public static void main(String[] args) 
   {
       Scanner sc=new Scanner(System.in);//scanner class
       System.out.println("Enter String value:");
       String s=sc.nextLine();
      
       char[] str1 = s.toCharArray();//converting string into char array
        int count=0;
       System.out.println(s);
      for(int i = 0 ; i<=str1.length-1;i++) 
      {
          for(int j = i+1; j <= str1.length-1;j++)
          {  
              if(str1[i] == str1[j])//condition to check if both are equal or not
              {
                  System.out.println(str1[j]);
                  count++;
                  break;
              }

          }   
      }
      System.out.println("Duplicate characters in a given string: "+count);
     
      sc.close();
   }
}