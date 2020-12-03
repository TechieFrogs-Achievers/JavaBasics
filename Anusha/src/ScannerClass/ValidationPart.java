package ScannerClass;
import java.util.*;
public class ValidationPart 
{
    public static void main(String[] args) 
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter int values:");
      int n=sc.nextInt();
       if(sc.hasNextInt())
      {
        System.out.println("int value is:"+n);
      } 
      else 
      {
        System.err.println("Error: Please Enter correct");
      }
    }
}
