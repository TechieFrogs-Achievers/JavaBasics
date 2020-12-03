package I.OStream;

import java.util.Scanner;

public class Example1 
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();                    //int value method
        if(number % 2 == 0)                     //checking if value is even or odd
        {
            System.out.println("The number is even");
        }
        else                                //if block is not excuted then else block is printed
        {
            System.err.println("The number is odd");
        }
        scan.close();
    }
    
}
