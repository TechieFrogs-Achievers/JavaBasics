package Strings;

import java.util.Scanner;

public class StringExercise2a
{
    public static void main(String[] args) 
    {
        System.out.println("enter no of names");
        Scanner sc = new Scanner(System.in); //scanner class
        int WrdLength = sc.nextInt(); //no of words 
        System.out.println("enter names");
        String words[]=new String[WrdLength]; // entering words
        for(int i=0;i<WrdLength;i++) //checking the no of words
        {
            words[i]=sc.next();
        }
        for(int i=0;i<WrdLength-1;i++) //loop for first word
        {
            for(int j=i;j<WrdLength;j++) //loop for second wrd
            {
                if(words[i].compareTo(words[j])>0) //comparing two wrds
                {
                    String temp = words[i];
                     words[i]=words[j];
                     words[j]=temp; //swapping of two words

                }
                
            }

        }
        for(int i=0;i<WrdLength;i++)
        {
            System.out.println(words[i]); //printing the words

        }
        sc.close();
        
    }

    
}
