package PracticeExcercises;

import java.util.Scanner;

public class StringViceversa 
{
    public static void main(String[] args) 
    {
        //String str = "bowANDarrow";
        //String str = "HELLO world PEOPle";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.nextLine();
        StringBuffer sb = new StringBuffer(str);
        for(int i =0; i < str.length(); i++)
        {
            if(Character.isLowerCase(str.charAt(i)))
            {
                sb.setCharAt(i, Character.toUpperCase(str.charAt(i)));
            }
            else if(Character.isUpperCase(str.charAt(i)))
            {
                sb.setCharAt(i, Character.toLowerCase(str.charAt(i)));
            }
            else
            {
              continue;
            }
        }
        System.out.println("string after replace :" + " " + sb);
        sc.close();

        
        
    }
    
}
