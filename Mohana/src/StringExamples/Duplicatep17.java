package StringExamples;

import java.util.Scanner;

public class Duplicatep17 
{
    public static void main(String[] args) 
    {  
        System.out.println("enter string");
        Scanner sc = new Scanner(System.in);//creating scanner obj
        String word = sc.nextLine();//taking string input
        int count = 0;
        char[] str = word.toCharArray();//converting string into char array

        System.out.println(word);
       for(int i = 0 ; i<=word.length()-1;i++) 
       {
           for(int j = i+1; j <= word.length()-1;j++)
           {  
               if(str[i] == str[j])//condition to check if both are equal or not
               {
                   System.out.println(str[j]);
                   count++;
                   break;
               }
           }   
       }
       sc.close();
    }
    
}
