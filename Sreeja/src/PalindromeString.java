import java.util.*;
public class PalindromeString
 {
     public static void main(String[] args)
      {
        String str1 = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String str = sc.nextLine();
        String temp = str;
        for(int i= str.length()-1;i>=0;i--)
        {
            str1 = str1+str.charAt(i);
        }
        System.out.println(str1.equals(temp)?"palindrome" :"not palindrome");
        sc.close();
    }
}
