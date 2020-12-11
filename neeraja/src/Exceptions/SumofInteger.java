package Exceptions;
import java.util.*;

//program to find sum of numbers using exceptin
class SumOfInteger{
    public static void main(String[] p) {

        Scanner scan=new Scanner(System.in);
        //exception handler(try-catch block)
        try{
        int firstNumber=scan.nextInt();
        double secondNumber=scan.nextDouble();
        //logic for sum of two numbers
        Double thirdNumber = firstNumber + secondNumber;
        System.out.println(thirdNumber);
        }
        //catch bock to catch exception
        catch(ArithmeticException  e){
            System.out.println(e);
        }
        //finally block
        finally
        {
           System.out.println("this is finally block");
        }
        scan.close();
     System.out.println("out of exception handler");


    }
}