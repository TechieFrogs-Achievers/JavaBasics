import java.util.*;
public class String16
 {
     public static void main(String[] args) 
     {
            Scanner sc = new Scanner(System.in);            //creating scanner class object

            System.out.println("Enter the sentence");

            String str = sc.nextLine();         //read the value from the user

            System.out.println(str.toUpperCase());      //coverting to uppercase
            
            sc.close();



    }
}
