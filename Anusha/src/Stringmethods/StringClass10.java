package Stringmethods;
import java.util.*;
public class StringClass10 
{
    public static void main(String[] args) 
    {
        //string with all characters
        //String s ="abcdefghijklmnopqrstuvwxyz";
        Scanner scan = new Scanner(System.in);
        System.out.println("enter String"); 
        String s = scan.next();
        StringBuilder sb = new StringBuilder();//ojject for stringbuilder class
        Random r = new Random();//object for random class
        int length = 4;
        for(int i=0 ;i<=length; i++)
        {
            int value = r.nextInt(s.length());//creating random integers

            char ch = s.charAt(value);//storing the character at index of s

            sb.append(ch);// append the character 

        }
        System.out.println("random string ="+sb);//printing the random values
        scan.close();

    }


}
