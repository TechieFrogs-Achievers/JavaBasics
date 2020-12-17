package Exceptions;

import java.util.Scanner;

public class SumofTwoNumbers {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        //try block for exception 
		try{
			int m = s.nextInt();
			int n  = s.nextInt();
			int sum = m + n;
			System.out.println(sum);
        }

        //catch block for handling the exception
		catch(Exception e ){
			System.out.println("Invalid Input");
        }
        s.close();
    }
}
