package StringsExercise;

import java.util.Scanner;

//class for finding duplicate words in a string
public class SecondExample18 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);                      //scanner class for giving input through keyboard
        String str = scan.nextLine().toLowerCase();                 //string creation and conveting to lowercase
        int count;
        //string is dividing into words and stored in an string array
        String words[]= str.split(" ");                             

        //loop for taking first word in an string array
        for(int i= 0; i < words.length; i++)
        {
            count =1;
            //loop for taking next word in an string array
            for(int j= i+1; j < words.length;j++)
            {
                //checking whether the first word and next word or equal or not equal
                if(words[i].equals(words[j]) )
                {
                    //if two words are equal then count is incremented
                    count++;
                    //second word is set to 0 because it is already visited 
                    words[j] ="0";
                }
            }
            //if count is greater than 1 then duplicate words are there in a string
            if(count > 1 && words[i] !="0")
            {
                //printing duplicated words 
                System.out.println(words[i] +" " +count);
            }
        }
        scan.close();                       //scanner close
        
    }
    
}
