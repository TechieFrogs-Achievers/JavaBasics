package Stringmethods;

public class StringClass19 
{
    public static void main(String[] args) 
    {
       //create a string
    String txt = "strings concerp in java";
    String str1 = "java";
    String str2 = "strings";

    // check if name is present in txt
    // using contains()
    boolean result = txt.contains(str1);
    if(result) 
    {
      System.out.println(str1 + " is present in the string.");
    }
    else 
    {
      System.out.println(str1 + " is not present in the string.");
    }

    result = txt.contains(str2);
    if(result) 
    {
      System.out.println(str2 + " is present in the string.");
    }
    else 
    {
      System.out.println(str2 + " is not present in the string.");
    }
   }
    
}
