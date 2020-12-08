package Strings;

import java.util.Scanner;

public class LargeSmallString 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();    
        String word = "";
        String small = "", large="";    
        String[] words = new String[100];    
        int length = 0;    
        str = str + " ";    
          
        for(int i = 0; i < str.length(); i++)
        {    
          //Split the string into words    
          if(str.charAt(i) != ' ')
          {    
            word = word + str.charAt(i);    
          }    
          else
          {      
            words[length] = word;       
            length++;       
            word = "";    
          }    
      }            
      small = large = words[0];    //Initialize small and large with first word in the string    
          
      //Determine smallest and largest word in the string    
      for(int k = 0; k < length; k++)
      {        
        if(small.length() > words[k].length())
        {
            small = words[k]; //small words
        }    
        if(large.length() < words[k].length())  
        {
            large = words[k]; //large words
        }  
                
      }    
      System.out.println("Smallest word: " + small);    
      System.out.println("Largest word: " + large);    
      sc.close(); //scanner close
        
    }
    
}
