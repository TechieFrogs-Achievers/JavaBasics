package ScannerClasses;

import java.util.Scanner;

public class ValidatingInput1 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        while(!s.hasNextInt()){ //it is checking the condition
            s.next();
            int n = s.nextInt();
        }
    }
}
