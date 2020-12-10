import java.util.*;
public class ScannerEx
 {
 public static void main(String[] args)
  {
        Scanner sc = new Scanner(System.in);        //create scanner object and read the value from user
    System.out.println("Enter your name");
        String name = sc.next();        //read the entered value
        System.out.println(name);       //print the value
        sc.close();
    }
}
