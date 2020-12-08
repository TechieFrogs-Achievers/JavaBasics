package StringsExercise;

import java.util.Scanner;

//class for separating each individual character in a string
public class SecondExample23 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);              //scanner class for taking input from user
        String str = scan.nextLine();                       //string creation
        //char letters[] = str.toCharArray();
        for(int i = 0; i < str.length(); i++)               //loop for taking each index in a string until string is at last index
        {
            System.out.print(str.charAt(i) + ",");
        } 
        scan.close();       //scanner close
    }
    
}
