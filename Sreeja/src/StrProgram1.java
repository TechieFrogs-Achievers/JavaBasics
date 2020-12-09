import java.util.*;
public class StrProgram1 
{
    public static void main(String[] args)
     {
       Scanner sc = new Scanner(System.in);     //create scanner class object

       System.out.println("enter string");

       String sr = sc.nextLine();        //read the string from user

       System.out.println(sr.length());     //using length()method to print the no. of characters

       sc.close();

       } 
}
