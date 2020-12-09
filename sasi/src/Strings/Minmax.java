package Strings;

import java.util.Scanner;

public class Minmax
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);              //scanner class for user input
        String str = scan.nextLine();                       //string creation
        char array[] = str.toCharArray();                   //character array to store string characters
        //min and max occuring characters assigned to first character
        char minOccuringCharacter = str.charAt(0);           
        char maxOccuringCharacter = str.charAt(0);
  
        //count is an array creation : it stores the counts of unique character using index
        int count[] = new int[str.length()];
        //loop is used to taking first character
        for(int i= 0; i< str.length(); i++)
        {
            count[i] =1;
            //loop for taking next character
            for(int j = i+1; j< str.length();j++)
            {
                //checking two characters is it same or not 
                if(array[i] == array[j] && array[i] != '0')
                {
                    count[i]++;
                    array[j] = '0';             //j value is assigned to 0 because it is visited
                 }
            }
        }
    }
}
