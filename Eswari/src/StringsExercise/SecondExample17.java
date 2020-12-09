package StringsExercise;

import java.util.Scanner;

//class for printing duplicate characters in astring
public class SecondExample17 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);                  //scanner class for giving input from user
        String str = scan.nextLine();                           //creating string 
        int count;
        char strArray[] =str.toCharArray();                     //divide the string into characters and stores in an array

        //loop for taking first character in an array
        for(int i= 0; i< str.length(); i++)
        {
            count=1;
            //loop for taking next character in an array
            for(int j= i+1; j < str.length(); j++)
            {
                //checking first and next characters are equal or not
                if(strArray[i] == strArray[j] && strArray[i] != ' ') 
                {   
                    //if the two characters are equal then count is incremented
                    count++;
                    strArray[j] ='0';           //if the character is visited then it is set to 0
                }
            }

            //if the count is greater then 1 then the duplicated characters are there in a string
            if(count >1 && strArray[i] !='0')    
            {
                System.out.println(strArray[i]);
            }
        }
        scan.close();                   //scanner class close
        
    }
    
}
