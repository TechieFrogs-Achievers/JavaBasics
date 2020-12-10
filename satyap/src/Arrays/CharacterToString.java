package Arrays;
import java.util.*;
public class CharacterToString  // class for converting character array to string and string to character array
{

public static void main(String[] args)
  {
    System.out.println("Enter length:");
    Scanner sc=new Scanner(System.in);//scanner class
    int length=sc.nextInt(); //length of character array 
    System.out.println("Enter characters:");
    char ch[]=new char[length];
    for(int i=0;i<ch.length;i++) //character array
    {
      ch[i]=sc.next().charAt(0);
    }
    String s=String.valueOf(ch);//character converts to string by using valueOf
    System.out.println(s); 
    
    
    System.out.println("Enter String:");
    String str=sc.next(); //string notation for input 
    for(int i=0;i<length;i++)// foor loop for storing characters in a character array
    {
      ch[i]=str.charAt(i); // spliting string in characters using charAt functions
    }
    for(int i=0;i<length;i++)// for loop for printing character array
    {
      System.out.print(ch[i]+" ");
    }
    sc.close(); //scanner close
  }   
}
