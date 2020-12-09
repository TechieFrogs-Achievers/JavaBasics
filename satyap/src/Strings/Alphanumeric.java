package Strings;
import java.util.*;
public class Alphanumeric // class for printing alphanumeric values in a string
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String upper=sc.next(); // string notation
        String lower=sc.next();
        String num=sc.next();
        String alphanumeric=upper+lower+num; // string contains upper case, lower case,numbers
        StringBuffer sb=new StringBuffer(alphanumeric); // stringbuffer class
        Random r=new Random(); // random obj
        for(int i=0;i<alphanumeric.length();i++) //for loop for appending the values and priting the alphanumeric values
        {
           int index=r.nextInt(alphanumeric.length());
           char randomChar=alphanumeric.charAt(index);
           sb.append(randomChar);
        }
        String randomString =sb.toString();
        System.out.println("Random String:"+randomString);
        
        sc.close();//scanner close
    }
    
}
