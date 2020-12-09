package StringExamples;

import java.util.Scanner;

public class Program23 
{
    public static void main(String[] args) 
    {
        
        int count = 0;
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();//taking input string1
        String s2 = sc.nextLine();//taking input string2
        String s3 = s1 +s2;//adding two strings
        System.out.println("the given string is : " +s3);
        for(int i = 0;i <= s3.length()-1;i++)
        {
            if(s3.charAt(i) != ' ')//condition to check the char or space
            {
                count++;
            }
            else{
                continue;
            }

        }
        System.out.println(count);
        sc.close();

    }
}

