package StringExamples;

import java.util.Scanner;

public class IndividualCharacters23 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
    System.out.println("enter the string");  
    String str =sc.nextLine(); //taking string input from keyboard 
    for(int i = 0; i < str.length(); i++)//loop to check condition
    {  
        System.out.print(str.charAt(i) + "  ");//print the indidual characters   
    }
    sc.close();
        
    }
    
}
