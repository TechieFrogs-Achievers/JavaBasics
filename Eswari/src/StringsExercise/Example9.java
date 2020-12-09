package StringsExercise;

import java.util.Arrays;
import java.util.Scanner;

public class Example9 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);                  //scanner method
        String word1 = scan.nextLine();                         //strings creating
        String word2 = scan.nextLine();
        if(word1.length() == word2.length())                    //checking two strings length
        {
            char sentance1[] = word1.toCharArray();             //converting string into character array
            char sentance2[] = word2.toCharArray();
            Arrays.sort(sentance1);                             //character arrays are sorting by using sort() method
            Arrays.sort(sentance2);
            boolean ansr = Arrays.equals(sentance1, sentance2);             //checking arrays character are equal are not
            if(ansr)                                                    //if boolean ansr is true then if block is excuted otherwise else block
            {
                System.out.println(word1 +" " +"and" +" "+word2 +" " +"are anagrams");
            }
            else
            {
                System.out.println(word1 +" " +"and" +" "+word2 +" " +"are not anagrams");
            }
        }
        else                                            //if lengths are not equal then this else is excuted
        {
            System.out.println("The words length are not equal");
        }
        scan.close();                   //scanner close
        
    }
    
}
