package InputValidation;
import java.util.Scanner;

public class ScannerExample1 {
    public static void main(String[] args) 
      
     {
         System.err.println("error message"); //prints the error message
         String s = "Jameema Bandaru"; //datamember
         //Scanner sc = new Scanner(s);  //prints
         System.out.println(s);

         Scanner sc1 = new Scanner(System.in); //scanner class
         System.out.println("enter name");
         String a = sc1.next();
         String b = sc1.next();
         System.out.println(a); //prints the first String
         System.out.println(b); //prints the second string

        System.out.println("result :" +sc1.hasNextLine());
         sc1.close();
         
     }
    
}
