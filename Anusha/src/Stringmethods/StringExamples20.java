package Stringmethods;
import java.util.*;
public class StringExamples20
{
    public static void main(String[] args) 
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter string");
      String str=sc.nextLine();
      String[] words = new String[100];    
      int length = 0;
      String word = "", small = "", large="";
      for(int i = 0; i < str.length(); i++)
      {    
        //Split the string into words    
        if(str.charAt(i) != ' ')
        {    
            word = word + str.charAt(i);    
        }    
        else
        {    
            //Add word to array words    
            words[length] = word;    
            //Increment length    
            length++;    
            //Make word an empty string    
            word = "";    
        }    
    }            
    //Initialize small and large with first word in the string    
    small = large = words[0];    
        
    //Determine smallest and largest word in the string    
    for(int k = 0; k < length; k++)
    {    
            
        //If length of small is greater than any word present in the string    
        //Store value of word into small    
        if(small.length() > words[k].length())    
            small = words[k];    
 
        //If length of large is less than any word present in the string    
        //Store value of word into large    
        if(large.length() < words[k].length())    
            large = words[k];    
    }    
    System.out.println("Smallest word: " + small);    
    System.out.println("Largest word: " + large);    
    }
}
