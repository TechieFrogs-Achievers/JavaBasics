package StringExamples;

import java.util.Scanner;

public class SpacesPrgm10 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String sentence = sc. nextLine();//input from keyboard
        
        System.out.println("Given Sentence: " + sentence);

        sentence = sentence.replaceAll("\\s", "");//method to delte  all white spaces
        System.out.println("After replacement:" +sentence);
        sc.close();
    }
    
}
