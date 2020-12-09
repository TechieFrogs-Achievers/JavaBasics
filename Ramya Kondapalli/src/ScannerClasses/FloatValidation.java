package ScannerClasses;

import java.util.Scanner;

public class FloatValidation {
    public static void main(String[] args) {
        float number;
        Scanner s = new Scanner(System.in);
        do{
            System.out.println("Enter a Float number");
            while(!s.hasNextFloat());{
            System.out.println("The Entered number is not float number");
            s.next();
        }
        number = s.nextFloat();
    }
        while(number<0);
        System.out.print(number + " is float number");

        
    }
}
