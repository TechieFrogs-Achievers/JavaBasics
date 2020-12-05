package ScannerClass;
import java.util.*;
public class ScannerClass2 
{
   public static void main(String[] args) 
   {
       Scanner sc=new Scanner(System.in);
       //using charAt method
       System.out.println("enter string value:");
       char c=sc.next().charAt(0);
       System.out.println("the value is:"+c);
       //byte value
       System.out.println("enter byte value:");
       byte b=sc.nextByte();
       System.out.println("byte value:"+b);
       //short value
       System.out.println("enter short value:");
       short s=sc.nextShort();
       System.out.println("short value:"+s);
       //boolean value
       System.out.println("enter boolean value:");
       boolean b1=sc.nextBoolean();
       System.out.println("boolean value:"+b1);
       //long value
       System.out.println("enter long value:");
       long l=sc.nextLong();
       System.out.println("long value:"+l);

       sc.close();
   } 
}
