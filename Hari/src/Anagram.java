import java.util.Scanner;
public class Anagram
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two strings : ");
        String s1 = sc.nextLine();             // initializing two strings
        String s2 = sc.nextLine();
        int count = 0;
        if(s1.length() != s2.length())
        {
            System.out.println("Given strings are not anagrams");
        }
        else
        {
            for(int i = 0 ; i < s1.length(); i++ )
            {
                char ch1 = s1.charAt(i);
                for(int j = 0 ; j < s2.length(); j++)
                {
                    char ch2 = s2.charAt(j) ; 
                    if(ch1 == ch2)
                    {
                        count++ ;
                    }
                }
            }
        }
        if(count == s1.length())
        {
            System.out.println("Given strings are anagrams");
        }
        else
        {
            System.out.println("Given strings are not anagrams");
        }
        sc.close();
    }
}