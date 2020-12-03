package ScannerClasses;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class ScannerClass3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter big integer value");
        BigInteger b = s.nextBigInteger(); //for big integer values

        System.out.println("Enter small integer value");
        BigDecimal bd = s.nextBigDecimal(); //for big decimal values

        System.out.println("Big Integer value :" + b);

        System.out.println("Big decimal value :" + bd);
    }
}
