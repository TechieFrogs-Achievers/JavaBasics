package InputValidation;

import java.util.Scanner;

public class ScannerEx1
{
    public static void main(String[] args) 
    {
        System.out.println("enter your character"); 
        Scanner s = new Scanner(System.in); //input stream
        char c=s.next().charAt(0); //assign value
        if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U') //if condition
        {
            System.out.println("the character is vowel:  "+ c); //its true
        }
        else
        {
            System.out.println("the entered character is consonent :   " +c); //if it false
        }
        
        s.close();
    }
    
}
