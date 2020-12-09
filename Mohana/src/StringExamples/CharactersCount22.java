package StringExamples;

import java.util.Scanner;

public class CharactersCount22
{
       public static void main(String[] args) 
       {
           int count = 0;
           Scanner sc = new Scanner(System.in);

           String word = sc.nextLine();


    for (int i =0;i<=word.length()-1;i++)//for loop to get the characters in each  string
    {
        
        if (Character.isLetter(word.charAt(i)))
        {
            count++;//if letter found count increases
         
        }
        else
        {
            continue;
        }
    }
    System.out.print(count);
    sc.close();


    }
}
