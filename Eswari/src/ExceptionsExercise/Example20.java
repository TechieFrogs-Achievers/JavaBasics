package ExceptionsExercise;

import java.util.Scanner;

//class to handle NumberFormatException
public class Example20 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);              //scanner class to taking input from user 
        String str = scan.next();               //taking string value from user
        //try block to check if the block have exception or not(if exception is not there then it prints 
        //try block statements otherwise the statements in try block are not excuted)
        try
        {
            //here we are trying convert string value to interger then exception occurs
            int number = Integer.parseInt(str);
            System.out.println("The converted number is : " +number);
        }
        //this block handles exception 
        catch(NumberFormatException nf)
        {
            System.out.println("We can not convert string to integer");
        }
        System.out.println("End of program");
        scan.close();           //scanner close
        
    }
    
}
