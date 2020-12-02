package ScannerExercises;
import java.util.Scanner;
//import java.util.*;

public class Example2 
{
    public static void main(String[] args)
    {
        System.out.println("------Adding two numbers----");
        Scanner Add = new Scanner(System.in);
        System.out.println("Enter the a value");
        int a = Add.nextInt();
        System.out.println("Enter the b value");
        int b= Add.nextInt();
        int sum = a+b;// adding two values in third variable
        System.out.println("The sum of the two values is :" + sum);// printing  sum of two values
        Add.close();

        
        
        
         

    }

    
}
