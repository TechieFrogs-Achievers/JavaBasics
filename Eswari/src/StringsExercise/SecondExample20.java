package StringsExercise;

import java.util.Scanner;

//class for finding smallest and largest word in a string
public class SecondExample20 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);                  //scanner class
        String str = scan.nextLine();                           //creation of atring
        String words[] = str.split(" ");                        //the string is divided when the space is there and stored in a string array
        int largestWordLength = 0;
        int smallestWordLength = Integer.MAX_VALUE;
        String largestWord = "";
        String smallestWord ="";
        
        
        for(int i = 0; i< words.length; i++)
        {
            if(words[i].length() < smallestWordLength)
            {
                smallestWord = words[i];
                smallestWordLength = words[i].length();
            }
            if(words[i].length() > largestWordLength)
            {
                largestWord = words[i];
                largestWordLength = words[i].length();
            }
        }
        System.out.println("The longest word in a string : " +largestWord);
        System.out.println("The smallest word in a string : " +smallestWord);
        scan.close();
    }
    
}
