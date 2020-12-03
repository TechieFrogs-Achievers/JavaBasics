package ScannerExercises;
import java.util.*;
public class Example1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);// creating object for scanner
        System.out.println("Enter the student name");
         //String name = sc.next(); 
         String name =sc.nextLine();//by using nextline it prints entire name
         System.out.println("std_Name :" +name);
         //System.err.println("employee ");// error message
         sc.close();
    }



    
}
