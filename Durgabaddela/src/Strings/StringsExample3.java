package Strings;

public class StringsExample3
{
   public static void main(String[] args)
   {
       String s1 = "Durga";//string declaration
       String s2 = "Durga";
       String s3 = "Durgaa";
       if(s1 == s2)//checking adress value in constant pool
       {
          if(s2 == s3)
          {
          System.out.println("references are equal");//return equal if they equal
          }
       else
       {
          System.out.println("references are not equal");//returns if not equal

       }
      }
       /*if(s2 == s3)//checking adress in the constant pool
       {
          System.out.println("true");
       }
       else
       {
          System.out.println("false");
       }*/

       
   } 
}
