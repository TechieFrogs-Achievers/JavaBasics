package StringsExercise;

import java.util.Scanner;

//class for finding all subsets of a string
public class SecondExample7 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);                  //scanner class for giving input through keyboard
        String str = scan.nextLine();                           //creating string 
        for(int i = 0; i < str.length(); i++)                   //loop for taking first character in a string
        {
            for(int j = i+1; j <= str.length(); j++)                //loop for taking second character in a string
            {
                System.out.println(str.substring(i, j));             //printing all substrings in a string
            }
        }
        
        scan.close();                       //scanner class closeing
    }
    
}
