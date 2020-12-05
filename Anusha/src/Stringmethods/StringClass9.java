package Stringmethods;
import java.util.*;
public class StringClass9 
{
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
         String s = checkAnagram;

		// Getting the input string from the user
		System.out.print("Enter the First String : ");
		String s1 = sc.nextLine();

		System.out.print("Enter the second String : ");
		String s2 = sc.nextLine();

		if (s1==s2)
			System.out.println(s1 + " and " + s2 + " are Anagrams");
		else
			System.out.println(s1 + " and " + s2 + " are NOT Anagrams");
         
		sc.close();
    }
}
