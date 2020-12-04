package Strings;
import java.util.*;
public class Captial 
{
    public static void main(String[] args) {
        //String name="satya";
        Scanner sc=new Scanner(System.in); // Scanner class
        String name=sc.next(); // Taking String input form console
        String firstLetter=name.substring(0,1); // taking first character in string by using substring method
        String remLetter=name.substring(1,name.length()); // taking reamining characters in string byusing  substring method
        firstLetter=firstLetter.toUpperCase(); // converting first char into uppercase
        name=firstLetter+remLetter; // concatnating two strings
        System.out.println("Name:"+name);
        sc.close(); // scanner class close.
    }
}
