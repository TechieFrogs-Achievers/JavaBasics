package StringExercises2;

import java.util.Scanner;

public class Stringlargendsmall 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the strings :");
        Scanner sc = new Scanner(System.in);//scanner class
        String str = sc.nextLine();//string variable
        String word="", smallest="",largest="";
         //int largestwrdlength=0;
         //int smallestwrdlength=Integer.MAX_VALUE;
        String words[] = str.split(" ");// it separate the words
        int length=0;// string length
        //str=str+"";
        for(int i = 0; i < str.length(); i++)//loop for checking the first word
        {
            if(str.charAt(i)!=' ')
            {
                word = word+str.charAt(i);
            }
            else
            {
                words[length]=word;
                length++;
                word="";

            }
        }
        smallest= largest=words[0];
        for( int j=0; j < length; j++)
        {
            if(smallest.length()>words[j].length())//it checks smallest word is greater than largest word
            {
                smallest= words[j];
            }
            if(largest.length()<words[j].length())// it checks the largest word
            {
                largest=words[j];
            }

        }
        System.out.println("the largest word is " + largest);
        System.out.println(" the smallest word is " +smallest);
        sc.close();
        
        
    }
    
}
