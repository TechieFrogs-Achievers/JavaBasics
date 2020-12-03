
package ScannerClass;
import java.util.*;
public class ScannerClass1 
{
   public static void main(String[] args) 
   {
      System.err.println("Error message:");//standard error stream
      Scanner sc=new Scanner(System.in);
     // int values
      System.out.println("Enter Int value:");
      int a=sc.nextInt();//gives the int values
      System.out.println("The Int Value is:"+a); 
     //float values
      System.out.println("Enter float value:");
      float b=sc.nextFloat();
      System.out.println("The float Value is:"+b); 
     //double values
      System.out.println("Enter double value:");
      double d=sc.nextDouble();
      System.out.println("The double Value is:"+d);
     //string content
      System.out.println("Enter string value:");
      String value=sc.nextLine();
      value=sc.nextLine();
      System.out.println("The string Value is:"+value); 
      System.out.println("Enter string value:");
      String val=sc.next();
     // value=sc.nextLine();
      System.out.println("The string Value is:"+val);
      sc.close();
   } 
}
