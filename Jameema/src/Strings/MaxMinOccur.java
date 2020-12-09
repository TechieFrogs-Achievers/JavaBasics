package Strings;

import java.util.Scanner;

public class MaxMinOccur 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);  //scanner class for user input
        String str = scan.nextLine();                 
        char array[] = str.toCharArray();          //character array to store string characters

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
        int maxLength =  count[0];
        int minLength = count[0];
        for(int i= 0; i< count.length; i++)
        {
            //if minimum length is greater than array's count 
            if(minLength >count[i] && count[i] != '0')
            {
                minLength = count[i];
                minOccuringCharacter = array[i];
            }
            if(maxLength < count[i])
            {
                maxLength = count[i];
                maxOccuringCharacter = array[i];
            }
        }
        System.out.println("Maximum occuring character is : " +maxOccuringCharacter);
        System.out.println("Minimum occuring character is : " +minOccuringCharacter);
        scan.close();


        
    }
    
}
