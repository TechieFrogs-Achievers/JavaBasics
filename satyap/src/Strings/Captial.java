package Strings;
import java.util.*;
public class Captial 
{
    public static void main(String[] args) {
        //String name="satya";
        Scanner sc=new Scanner(System.in); // Scanner class
        String str=sc.nextLine(); // Taking String input form console
        String words[]=str.split(" ");
        String words1="";
        for(int i=0;i<words.length;i++)
        {
           words1+=Character.toUpperCase(words[i].charAt(0))+words[i].substring(1)+" ";
        }
        System.out.println(words1);
        sc.close();
    }
}
