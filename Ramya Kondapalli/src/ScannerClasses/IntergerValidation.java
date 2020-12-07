package ScannerClasses;

import java.util.Scanner;

public class IntergerValidation {
    public static void main(String[] args) {
        System.out.println("enter a positive integer");
       Scanner sc = new Scanner(System.in);
       
       if(sc.hasNextInt())//checking for giving input is int or not
       {
       int num = sc.nextInt();
           if(num>0){// checking for giving value is positive number or not
               System.out.println("numer is positive integer ="+num);
           }
           else{
               System.out.println("number is negative integer ="+num);
           }
       }
       else
       {
           System.out.println("enter a valid integer");
       }
       sc.close();
    }
}
