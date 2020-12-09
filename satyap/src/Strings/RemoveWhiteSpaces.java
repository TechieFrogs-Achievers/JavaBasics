package Strings;
import java.util.*;
public class RemoveWhiteSpaces 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str.replaceAll(" ","");
        System.out.println("String after removing spaces:"+str);
        sc.close();
    }
}
