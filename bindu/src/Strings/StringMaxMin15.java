package Strings;

import java.util.Scanner;

public class StringMaxMin15 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);   //scanner class object
        String str = sc.nextLine();   //string creation 
        char Array[]=str.toCharArray();    //stores the characters 
        char minCharacter = str.charAt(0);    //for storing the characters
        char maxCharacter = str.charAt(0);
        int count[]=new int[str.length()];  //new string 
        for(int i=0;i<str.length();i++)
        {
            count[i]=1;    //to check the nxt char
            for(int j=i+1;j<str.length();j++)
            {
                if(Array[i]==Array[j]&&Array[i]!='0')   
                {
                    count[i]++;
                    Array[j]='0';   //assigns the nxt value
                }
            }
        }
        int maxLength=count[0];
        int minLength=count[0];
        for(int i=0;i<count.length;i++)
        {
            if(minLength>count[i]&&count[i]!='0')   //checks the length of the char
            {
                minLength=count[i];
                minCharacter=Array[i];
            }
            if(maxLength<count[i])
            {
                maxLength=count[i];
                maxCharacter=Array[i];
            }
        }  
        System.out.println("maximum character is:"+minCharacter);   //prints the min char
        System.out.println("minimum character is:"+maxCharacter);
        sc.close();
    }
    
}
