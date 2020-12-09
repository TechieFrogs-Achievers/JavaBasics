package Strings;
import java.util.*;
public class String12  //class for replacing space with special character
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); //scanner class
        String str=sc.nextLine(); //string notation
        System.out.println(str.replace(" ","_")); //replace space with _
        sc.close(); //scanner close
    }
}
