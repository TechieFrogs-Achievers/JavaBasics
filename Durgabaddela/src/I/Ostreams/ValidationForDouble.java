package I.Ostreams;

import java.util.Scanner;

public class ValidationForDouble 
{
    public static void main(String[] args)
    {
        System.out.println("enter a positive integer");
       Scanner sc = new Scanner(System.in);
       
       if(sc.hasNextDouble())//checking for giving input is double or not
       {
       double num = sc.nextDouble();
           if(num>0)
           {
               System.out.println("numer is positive double ="+num);
           }
           else{
               System.out.println("number is negative double ="+num);
           }
       }
       else
       {
           System.out.println("enter a valid double number");
       }
       sc.close();
       
       

    }
}
