package ScannerClasses;

//validating Int number through scanner class

import java.util.Scanner; //importing scanner package 

public class ScannerClasses4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        do{
            System.out.println("Enter a positive Number");
            while(!s.hasNextInt());{    //condition to check number is +ve or not
                //if number is -ve then it will enter into loop 
                System.out.println("It is not correct number");
                s.next();
            }
        n = s.nextInt(); //it will expect input untill it get +ve number 
        }
        while(n<=0);
        System.out.println("Yeah ! It is positive number");
    }
}
