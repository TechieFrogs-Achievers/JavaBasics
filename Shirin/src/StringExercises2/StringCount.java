package StringExercises2;

import java.util.Scanner;

public class StringCount 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);//scanner class
        String str = sc.next();// data type
        int count = 0;
        for(int i =0; i < str.length();i++)
        {
            if(str.charAt(i)!=' ')// it checks every character except space
            {
                 count++;
            }
        }
            System.out.println("the number of characters :" +count);// printing
        
        sc.close();
        
    }
    
}
