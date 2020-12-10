package Exceptions;
import java.util.Scanner;

public class Exception1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        //try catch block
        try
        {
        int num1= sc.nextInt();//taking input from keyboard
        int num2 = sc.nextInt();
        int sum = num1+num2;
        System.out.println(" the sum of two numbers is="+sum);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
