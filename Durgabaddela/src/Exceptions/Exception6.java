package Exceptions;

import java.util.Scanner;

public class Exception6 
{
    public static void main(String[] args)
    { 
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a and b values");
        int a = sc.nextInt();//taking inputs from keyboard
        int b =sc.nextInt();

        //the outer try block
        try{
            //System.out.println("this is the outer try block");
            if(b==0)//if b is less than 1 this shuold be executed
            System.out.println("the b value should be greater thean 0");
             try{
                 int divide = a/b;
                 System.out.println("inner try block");
                 System.out.println(divide);
             }
             catch(ArithmeticException ae)//inner catch block to handle arithematic ecxeption
             {
                 System.out.println("getting Arithenatic Exception");
             }
        }
        catch(IllegalArgumentException e)//outer catch block
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("end of all exception");//fanally block 
            
        }
    } 
    
}
