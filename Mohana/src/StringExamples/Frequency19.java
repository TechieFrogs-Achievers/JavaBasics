package StringExamples;

import java.util.Scanner;

public class Frequency19 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);//scanner obj creation
        String word=sc.nextLine();//taking input from keyboard
        int count=0;

        for(int i=0;i<=word.length()-1;i++){
            if(word.charAt(i)=='m')//condition to check letter in a word
            {
                count++;
            }
        }
        System.out.println("m repeated in "+count + " this times");
        sc.close();
        
    }
    
}
