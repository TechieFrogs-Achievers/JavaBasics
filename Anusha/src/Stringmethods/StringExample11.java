package Stringmethods;
import java.util.*;
public class StringExample11 
{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner (System.in);//scanner class
        System.out.println("Enter lower letter string : ");
        String str = sc.nextLine();
        //replace lower-case characters with upper-case
        String uppstr = str.replace(str,str.toUpperCase());
        System.out.println(uppstr);
        //replace upper-case characters with lower-case
        System.out.println("Enter upper letter string : ");
        String str1=sc.nextLine();
        String lowerstr = str1.replace(str1,str1.toLowerCase());
        System.out.println(lowerstr);
        sc.close();


    }
}
