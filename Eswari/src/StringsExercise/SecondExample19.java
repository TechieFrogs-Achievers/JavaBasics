package StringsExercise;

import java.util.Scanner;

//class for finding frequency of characters in a string
public class SecondExample19 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);                  //scanner class for taking input from user
        String str = scan.nextLine();                           //string creation

        int freq[] = new int[str.length()];
        
        //dividing string into letters and store in an array of characters
        char letters[] = str.toCharArray();                     
        //int count;

        //loop for taking first character in an array
        for(int i=0; i < str.length(); i++)
        {
            //count = 1;
            freq[i] =1;
            //loop for taking next character in an array
            for(int j= i+1; j < str.length();j++)
            {
                //checking two characters are same or not
                if(letters[i] == letters[j])
                {
                    //if two characters are same then count is incremented
                    //count++;
                    freq[i]++;
                    letters[j] = '0';               //j'th character is set to 0 because for it is visited 
                }
            }
            //if count is greater than 1 then the frequency of character  is increased
            if(letters[i] != '0' && letters[i] != ' ')
            {
                System.out.println(letters[i] +" " +freq[i]);
            }
        }
        scan.close();               //scanner close
        
    }
    
}
