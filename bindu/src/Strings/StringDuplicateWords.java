package Strings;

import java.util.Scanner;

public class StringDuplicateWords 
{
    public static void main(String[] args) {
        System.out.println("Enter the String:");
        Scanner sc = new Scanner(System.in);   //scanner class object 
        String str = sc.nextLine();   //string creation
        int count;
        String Word[]=str.split("");   //splits the word count
        for(int i=0;i<=Word.length;i++)
        {
            count=1;
            for(int j=i+1;j<Word.length;j++)    //checks the condition of the word length 
            {
                if(Word[i].equals(Word[j]))    //if word i equals to word j 
                {
                    count++;  //the count increases 
                }
            }
            if(count>1 && Word[i]!="0") 
            {
                System.out.println(Word[i]+" "+count);   //prints the word count 
            }
        }
        sc.close();
    }
    
}
