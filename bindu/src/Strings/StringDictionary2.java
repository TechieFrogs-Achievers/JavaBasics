package Strings;

import java.util.Scanner;

public class StringDictionary2 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter The Length Of The String:");
        Scanner sc = new Scanner(System.in);     //scanner object
        int s = sc.nextInt();
        System.out.println("Enter The Names:");
        String[] str = new String[s];    //new string 
        for(int i =0;i<s;i++)
        {
            str[i] = sc.next();   //checks the string
        }
        for(int i=0;i<s-1;i++)
        {
            for(int j=i;j<s;j++)
            {
                if(str[i].compareTo(str[j])>0)   //compares the two strings
                {
                    String temp =str[i];   //swapping the string values
                    str[i]=str[j];
                    str[j]=temp; 
                }
            }
        }
        for(int i =0;i<str.length;i++)   //prints the final string
        {
            System.out.println(str[i]);
        }
        sc.close();
    }
    
}
