import java.util.*;
public class ScannerEx1
 {
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);     //create scanner object and read the value from console
    System.out.println("Enter your name");
    String name = sc.nextLine();        //read the value
    System.out.println("Enter another name");
    String nameOf = sc.nextLine();      //read the value
    System.out.println(nameOf+" "+name);        //printing the values
    sc.close();


   } 
}
