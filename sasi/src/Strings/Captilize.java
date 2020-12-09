package Strings;

import java.util.Scanner;

public class Captilize 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
       /* String firstword=s.substring(0,1); //string gives uppercase for firstletter by using substring method
        String secondword=s.substring(1,s.length()); //taking remaining char in string by substring 
        firstword=firstword.toUpperCase(); // first charstring coverting  in uppercase
      String  name=firstword+secondword;// concatenate the two strings
      System.out.println(name); */
      String words[]=s.split(" "); //using split() for space here we taking a string and storing it in an array
      String words1=""; // storing an remaining char
      for(int i=0;i<words.length;i++)
      {
        words1+=Character.toUpperCase(words[i].charAt(0))+ words[i].substring(1)+" "; //changing the giving string into uppercase 
      }
      System.out.println(words1);
      sc.close();
    }
        
        
    }
    

