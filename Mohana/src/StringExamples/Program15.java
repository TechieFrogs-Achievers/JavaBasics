package StringExamples;

import java.util.Scanner;

public class Program15 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();//taking string input
        String words[] = sentence.split(" ");//it splits the word at spaces

        String completeSentence = " "; //to print final string

        for(String b : words)//for ecah loop to get words 
        {
          String capital = b.substring(0,1);//to capitalize first character 
          String remainword = b.substring(1);//remaing words in this string

         completeSentence += capital.toUpperCase()+remainword + " ";
        }

        System.out.println(completeSentence);
        sc.close();
        
    }
    
}
