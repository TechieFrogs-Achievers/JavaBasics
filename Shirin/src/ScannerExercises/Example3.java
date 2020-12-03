package ScannerExercises;
import java.util.*;

public class Example3 
{
    public static void main(String[] args) 
    {
        System.out.println("-----using all data types-----");
        System.out.println(" ");
        Scanner sc = new Scanner(System.in);// creating object 
        System.out.println("*Enter  employee Details*");
        //Data types
        System.out.println(" Enter employee char");
        char e = sc.nextLine().charAt(0);// character
        System.out.println(" Enter employee name");
        String emp_name = sc.nextLine();// string
        System.out.println(" Enter employee ID");
        int emp_id = sc.nextInt();// integer
        System.out.println(" Enter employee salary");
        double emp_salary = sc.nextDouble();// double
        System.out.println(" Enter employee phn");
        long emp_phn = sc.nextLong();//long
        System.out.println(" Enter employee  validation");
        boolean emp_pass = sc.nextBoolean();// boolean 
        // printing employee details
        System.out.println("emp_char :" +e);
        System.out.println("emp_name :" +emp_name);
        System.out.println("emp_id :" +emp_id);
        System.out.println("emp_salary :" +emp_salary);
        System.out.println("emp_phn :" +emp_phn);
        System.out.println("emp_valid:" +emp_pass);
        sc.close();
 
        
    }
    
}
