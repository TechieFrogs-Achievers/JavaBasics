package Exceptions;

import java.util.Scanner;

public class ArithmeticException1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        //try block for Exceptions
        try{
            //taking the user inputs
            System.out.println("Enter numerator ");
            int m = s.nextInt();
            System.out.println("Enter denomimerator ");
            int n = s.nextInt();
            int res = m/n; 
            System.out.println(res);
        }

        //catch block for handling the exception
        catch(ArithmeticException ae){
            System.out.println("Arithemetic Exception");
        }
        
        s.close();
    }
}
