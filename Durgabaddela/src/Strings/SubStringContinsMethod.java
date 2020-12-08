package Strings;

//import java.util.Scanner;

public class SubStringContinsMethod
{
   public static void main(String[] args)
   {
    //Scanner sc = new Scanner(System.in);
    //String s1 = sc.nextLine();
    //String s2 = sc.nextLine();
    String s ="DurgaBaddela";

    if(s.contains("ddela"))//contains method
    {
        System.out.println("it contains substring "+s);
    } 
    else
    {
        System.out.println("it does not contain substring");
    }  
    //sc.close();
   } 
}
