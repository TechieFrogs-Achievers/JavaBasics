package StringsExercise;

import java.util.Scanner;

//driver class
public class SecondExample3 
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);                  //taking input from user
        String str = scan.nextLine();                           //string creation
        int count = 0;
        for(int i = 0; i < str.length(); i++)                   //loop for iterating until the string is there
        {
            if(str.charAt(i) == '!' || str.charAt(i) == '?' || str.charAt(i) == '.' || str.charAt(i) == ',' || str.charAt(i) == ';' || 
            str.charAt(i) == ':' || str.charAt(i) == '/' )                  //if condition for checking punctuation characters in a string
            {
                count++;                                //punctuation characters are there then count is incremented
            }

        }
        System.out.println("The count of punctuation characters are " +count);
        scan.close();                                       //scanner close
    }
    
}
