package StringsExercise;

import java.util.Scanner;

//class for checking the string is palindrome or not
public class SecondExample13 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);                  //scanner class for giving input from user
        String str = scan.nextLine();                           //string creation
        String temp = "";                                       //creating empty string
        for(int i= str.length()-1;i >= 0; i--)                  //loop iterated untill the string is empty
        {
            temp = temp + str.charAt(i);                        //creating string in a reverse order
        }
        //checking whether the the taken string and temp string is equal or not if equal it prints palindrome
        if(temp.equals(str))
        {
            System.out.println("Given string is PALINDROME");
        }
        //if condition is not true then else block is excuted
        else
        {
            System.out.println("Given string is NOT A PALINDROME");
        }
        scan.close();               //scanner class closing
    }
    
}
