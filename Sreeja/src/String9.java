import java.util.*;
public class String9 
{
 public static void main(String[] args)
  {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two strings");

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        int count=0;

        if(str1.length()!=str2.length())
        {
            System.out.println("entered strings are not anagram");
        }
        else
        {
            for(int i=0;i<str1.length();i++)
            {
                for(int j=0;j<str2.length();j++)
                {
                    if(str1.charAt(i)==str2.charAt(j))
                    {
                        count++;
                    }
                }
            }
        }
        if(count==str1.length())
        {
            System.out.println("Entered strings are anagram");
        }
        else
        {
            System.out.println("Entered strings are not anagrams");
        }

        sc.close();

    }

    
}
