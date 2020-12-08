package Stringmethods;
import java.util.*;
public class StringClass15 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);//scanner class
        System.out.println("Enter any sentence : ");
        String string = sc.nextLine();
        String words[] = string.split(" ");
        String capWord = "";
        for(String i : words )
        {
            String first = i.substring(0,1);
            String remaining = i.substring(1);
            capWord += first.toUpperCase() + remaining + " " ;  
        }
        System.out.println(capWord.trim());
        sc.close();

          } 
}
