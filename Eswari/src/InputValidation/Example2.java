package InputValidation;

import java.util.Scanner;

public class Example2 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                    //assigning int value965

        System.out.println("Enter a number :");
        
        if(sc.hasNextInt())                                 //scanner method
        {
            int number = sc.nextInt();
            while(number < 1 || number > 500)                   //checking number
            {
                System.out.println("please enter a valid number");
                System.out.println("Enter a number :");
                number = sc.nextInt();
                System.out.println("You entered number " +number);
            }
        }
        else
        {
            System.out.println("Enter a valid number");
        }
        sc.close();
    }

    
}
