package I.Ostreams;

import java.util.Scanner;

public class ValidationForInt2 
{
    public static void main(String[] args)
    {
        System.out.println("enter an integer");
       Scanner sc = new Scanner(System.in);
         //int number = sc.nextInt();
         
         while(!sc.hasNextInt())//checking for giving input is int or not

         {
             System.out.println("this is not an integer ,try again" +sc.hasNextInt());
              sc.next();//moves to the next token 
         }
        int number = sc.nextInt();
         System.out.println(" integer number is ="+number);
         sc.close();
    }

 }

