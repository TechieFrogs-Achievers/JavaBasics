package Stringmethods;

public class StringClass6 
{
   public static void main(String[] args) 
   {
    String s1="hello";
    String s2="hello world";
    String str=new String("hello");
    //comapre string using equals()
    System.out.println(s1.equals(s2)); //false
    System.out.println(s1.equals(str)); //true  
    System.out.println(s1.equalsIgnoreCase(s1));//true

   } 
}
