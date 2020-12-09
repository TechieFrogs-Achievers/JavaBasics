package Strings;

import java.util.Scanner;

public class StringDuplicateCharacters 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the string:");
        Scanner sc = new Scanner(System.in);   //scanner class object
        String str = sc.nextLine();   //string creation 
        int count;
        char Array[]=str.toCharArray();   //stores the characters in the array
        for(int i=0;i<str.length();i++)
        {
            count=1;
            for(int j=i+1;j<str.length();j++)
            {
                if(Array[i]==Array[j] && Array[i]!=' ')  
                {
                    count++;
                    Array[j]='0';
                }
            }
            if(count>1&&Array[i]!='0')
            {
                System.out.println(Array[i]+" "+count);
            }
            sc.close();

        }
    }
}

