package Exceptions;

public class Exception3 
{
   // public static void main(String[] args)
     //{
        public static void divideByZero() // division method 
         {
            throw new ArithmeticException("Trying to divide by 0"); // using throw keyword
          }
        
         public static void main(String[] args) {
            divideByZero(); // method from class
          }
       // }
        }
