package PracticeExcercises;

import java.util.Scanner;

public class StringUnique 
{
   
  public static void main(String args[]) 
  {
    
   /* Scanner sc=new Scanner(System.in);    // scanner class
    System.out.println("Enter the string");
     String str=sc.nextLine();    // method for taking input data type
    String words[]=str.split(" ");   // initiallizing array for storing the string
                
    int count=0;
    for(int i=0;i<words.length;i++)    // loop for checking first word in given input
    {  
        if(words[i].equals("") || words[i].equals(" "))    // checking spaces of two words
          {                      
            continue; 
          }
       else 
       {                  
              for(int j=i+1;j<words.length;j++)     // loop for checking second word in given input
              {
                if(words[i].equals(words[j]))       // method for comparing the two words whether words are repeated or not
                 { 
                   count=1;
                   words[j]=" ";    // remove the repated word from array
                   break;
                 }
              }
              /*if(count==0)
              {
               //System.out.print(words[i]+" ");
                System.out.println(count); 
              }
              count=0;     
        }
        System.out.println("total:" +count);
    }*/
 // }
  //String str = " I love to Swim and I like to travel abroad";
  Scanner sc = new Scanner(System.in);     // scanner class
  System.out.println("Enter the string ------->");
  System.out.println(" The input string must be in lowercase or uppercase(case sensitive)--");
  String str = sc.nextLine();                   //method for taking input  string data type from user
  String[] words = str.split(" ");               // initiallizing array for storing the string


  if(!str.matches("[a-zA-Z]+"))
  {
    System.out.println(" INVALID INPUT ---> please enter valid input string:");
    
  }
    /*for(char c :str.toCharArray())     // loop for checking the input is string or not
  {
    if(!Character.isAlphabetic(c))      // if it is not alphabet
    {
      System.out.println("INVALID INPUT --> Please enter valid input as  string");
      break;
    }
  }*/
  boolean [] array = new boolean[words.length];
       
  int count = 0;
  for (int i = 0; i < words.length; i++)     // loop for checking the first word in the given text
  {
      if (!array[i]) 
      {
          count++;
          for (int j = i + 1; j < words.length; j++)    // loop for checking the second word in the given text
          {
              if (words[i].compareTo(words[j]) == 0)     // method for comparing the two strings repeated or not
              {
                  array[j] = true;
                  count--;      
              }
          }
      }
  }
  System.out.println("count of the unique string in given text  :" + count);    // printing the unique strings
  sc.close();     // scanner class close



  /*String str = "Mounika shirin Andukuri";
  int count = 0;
  for ( int i =0; i < str.length()-1; i++)
  {
    if(str.charAt(i)==' ' && Character.isLetter(str.charAt(i+1))&&(i>0))
    {
      count++;
    }
  }
  count++;
  System.out.println("Total count of the string is :" + count);*/

}

  
}
    
