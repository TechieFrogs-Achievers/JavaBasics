package Strings;
import java.util.*;
public class RandomString
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuffer sb=new StringBuffer(str);
        Random r=new Random();
        for(int i=0;i<str.length();i++)
        {
           int index=r.nextInt(str.length());
           char randomChar=str.charAt(index);
           sb.append(randomChar);
        }
        String randomString=sb.toString();
        System.out.println("Random String:"+randomString);
    }
}
