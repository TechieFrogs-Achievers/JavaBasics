package scanner;

import java.util.Scanner;

public class IntValidation {
    public static void main(String[] f){
    Scanner sc = new Scanner(System.in);
float number;
do {
    System.out.println("Please enter a positive decimal number!");
    while (!sc.hasNextFloat()) {
        System.out.println("That's not a float  number!"+sc.hasNextFloat());
        //System.out.p
        sc.next(); // this is important!
        System.out.println(sc.next());
    }
    number = sc.nextFloat();
} while (number <= 0);
System.out.println("Thank you! Got " + number);
    
}
}