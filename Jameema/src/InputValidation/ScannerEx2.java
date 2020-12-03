package InputValidation;

import java.util.Scanner;

public class ScannerEx2 
{
    public static void main(String[] args) 
    {
        System.out.println("enter value:");
        Scanner s = new Scanner(System.in); //input stram
        
        if(s.hasNextInt()) //scanner methods
        {
            int empId = s.nextInt(); //assign value
            System.out.println("empId is :  "+empId );
            while(empId<101 || empId>150) //checking condition
            {
                
                System.out.println("enter valid empid"); //if it false
                empId=s.nextInt(); //reenter the value
                System.out.println("empId is :  "+empId ); //resulr
            }
        }
        else
        {
            System.out.println("it is not under empid"); //the given input is false
        }
        s.close();
        
    }
    
}
