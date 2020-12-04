package ScannerClasses;

import java.util.Scanner; //importing scanner package

public class ScannerClasses1 {
    public static void main(String[] args) {
        //create an object of scanner
        Scanner s = new Scanner(System.in);
        System.out.println("enter your name");
        String s1 = s.next();
        String s2 = s.nextLine();
        System.out.println(s1);
        System.out.println(s2);
        s.close();
    }
}
