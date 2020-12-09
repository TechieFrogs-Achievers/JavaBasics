package I.Ostreams;

import java.util.Scanner;

public class ValidationForString
{
    public static void main(String[] args) {
        
    
    System.out.println("enter a String");
    Scanner sc = new Scanner(System.in);
      
      while(!sc.hasNextLine())// checking for giving input is string or not

      {
          System.out.println("this is not a valid String ,try again");
           sc.next();//moves to the next token 
      }
     String s = sc.nextLine();
      System.out.println("the integer number is ="+s);
      sc.close();
    }

}
