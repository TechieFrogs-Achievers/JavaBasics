package StringExamples;

import java.util.Scanner;

public class Program18Foreach 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();

        char letter[] = sentence.toCharArray();//converting string into character array

       for(char l : letter )//loop to get characters
       {

           System.out.println(l);
       }
        sc.close();
        
    }
    
}
