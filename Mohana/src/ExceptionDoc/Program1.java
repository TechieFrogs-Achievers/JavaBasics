package ExceptionDoc;

import java.util.Scanner;

public class Program1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        //try and catch blocks to handle exceptions
        try
        {
            int a = sc.nextInt();
             int b = sc.nextInt();

            int sum = a+b;

            System.out.println(sum);

        } 
        catch(Exception e) //carch block to handle input mismatch exception
        {
              System.out.println("input mismatch");
        }
        sc.close();
    }
    
}
