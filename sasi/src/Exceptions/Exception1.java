package Exceptions;

import java.util.Scanner;

public class Exception1 {
 public static void main(String[] args) 
 {
      int a, b, result;
      Scanner sc = new Scanner(System.in);//user input
      System.out.println("Input two integers");
      a = sc.nextInt(); //read the elem
      b = sc.nextInt();
 
  // try block
 
  try {
    result  = a + b;
    System.out.println("Result = " + result);
  }
 
  // catch block
 
  catch (ArithmeticException e) //arithemic excep
   {
    System.out.println("Exception caught: Division by zero.");
  }
  sc.close();
    }
}
