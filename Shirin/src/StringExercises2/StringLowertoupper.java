package StringExercises2;

import java.util.Scanner;

public class StringLowertoupper 
{
    public static void main(String[] args) 
    {
        System.out.println(" Enter the string :");
        Scanner obj = new Scanner(System.in);//scanner class
        String str = obj.nextLine();
        str = str.replaceAll(str.toLowerCase(),str.toUpperCase());// it converts  (lower to upper)
        System.out.println(str);
        obj.close();// closing scanner class


        
    }
    
}
