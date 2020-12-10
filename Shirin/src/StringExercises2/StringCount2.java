package StringExercises2;

import java.util.Scanner;

public class StringCount2 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the string :");
        Scanner sc = new Scanner(System.in);//scanner class
        String str1 = "shirin";// data type
        String str2 = sc.nextLine();
        int count = 0;
        for(int i =0; i < str2.length();i++)// loop checks  second string 
        {
            if(str2.charAt(i)!=' ')// it checks every character except space
            {
                 count++;
            }
        }
            System.out.println("the number of characters :" +count);// printing
            System.out.println(str1);
        
        sc.close();
        
    }
    
}
