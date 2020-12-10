import java.util.*;
public class StrProgram4 
{
     public static void main(String[] args) 
     {
       Scanner sc = new Scanner(System.in);             //creating scanner class object
       
       System.out.println("Enter sentence");

       String str = sc.nextLine();          //read the string from user

       String sr = str.toLowerCase();

        int count = 0;
        int count1=0;

        //loop to check the vowel or consonant

       for(int i=0;i<str.length();i++)
       {
        char ch = sr.charAt(i);

        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')         //condition to check vowels
        {
            count++;
        }
        else if(ch>='a'&&ch<='z')                   //condition to check consonants
        {
            count1++;
        }

       }
        
       //printing the vowels and consonants
       
        System.out.println("NO.of vowels"+count);
        System.out.println("No.of consonants"+count1++);

        sc.close();

    }
}
