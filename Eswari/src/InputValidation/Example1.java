package InputValidation;

import java.util.Scanner;

public class Example1 
{
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Enter a number: ");
        //checking for giving input is int or not
        if(scannerObj.hasNextInt())
        {
            int number = scannerObj.nextInt();                      //initializing int value to number variable
            //condition checking for giving value is positive number or not
            if(number > 0)
            {
                System.out.println("You entered a positive number " +number);
            }
            //if block is not excuted then else block is excuted
            else
            {
                System.out.println("You entered a negative number " +number);
            }
        }
        //if giving input is not int then this else is excuted
        else
        {
            System.out.println("Please enter a valid input");
        }
        scannerObj.close();
    }
    
}
