package ScannerClass;

import java.util.Scanner;

public class DoubleValidations 
{
    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);
         System.out.println("enter your input");
         while(!obj.hasNextDouble())
         {
            System.out.println("plz enter double input"); 
            obj.next();
         }
         double num = obj.nextDouble();
         System.out.println("entered double input  " +num);
         obj.close();
    }
    
}
