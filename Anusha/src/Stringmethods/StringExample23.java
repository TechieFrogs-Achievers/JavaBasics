package Stringmethods;
import java.util.*;
public class StringExample23 
{
    public static void main(String[] args) 
    {
      Scanner sc=new Scanner(System.in);//create object for scannerclass
      System.out.println("Enter string:");
      String str=sc.nextLine();
      //separate the Individual Characters from a String
      for(int i = 0; i < str.length(); i++)
      {  
        System.out.print(str.charAt(i) + "  ");  
      }  

    }
}
