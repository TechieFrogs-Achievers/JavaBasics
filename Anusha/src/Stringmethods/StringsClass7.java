package Stringmethods;

public class StringsClass7 
{
   public static void main(String[] args) 
   {
      String str1=new String("bold");
      String str2=new String("bold");
      String str3=new String("underline");
      //comapre string objects  using == operator
      System.out.println(str1==str2);//false(because str2 refers to instance created in nonpool)
      System.out.println(str1==str3);//false
      if(str1==str2)
      {
          System.out.println("equal");
      }
      else
      {
           System.out.println("not equal");
      }
   } 
}
