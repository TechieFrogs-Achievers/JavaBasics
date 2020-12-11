package Exceptions;
import java.util.*;
public class ExceptionHandling25 
{
    static void splitString(String text)
    {
        try
        {
            String[]  s=text.split("/");
            for(int i=0;i<s.length;i++)
            {
                System.out.println("Splitted string array of index "+i+" is "+s[i]);
            }
        }
        catch(Exception ex)
        {
            System.out.println("Exception while performing division : "+ex.toString());
        }
        finally{
            System.out.println("finally block");
        }
    }
   public static void main(String[] args) 
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter number one: ");
      String text=sc.nextLine();
      if(text.length()>0)
      {
          splitString(text);
      }
      else
      {
       //passing null as input for splitting
       splitString(null);
      }
    } 
}
