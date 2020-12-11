import java.util.*;
public class String6
 {
     public static void main(String[] args) 
     {
        Scanner sc = new Scanner(System.in);                //create scanner object and read the value from user

        System.out.println("Enter both strings");

        String str1 = sc.next();        //read the value
        String str2 = sc.next();        //read the value
        
        if(str1.equals(str2))       //comparing the strings using equals()
        {
            System.out.println("Both are same");
        }
        else
        {
            System.out.println("Both are different");
        }
        sc.close();
        
    }
}
