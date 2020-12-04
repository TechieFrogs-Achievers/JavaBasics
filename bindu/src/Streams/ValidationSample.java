package Streams;
import java.util.*;

public class ValidationSample
 {
     public static void main(String[] args) 
     {
         Scanner i = new Scanner(System.in);   //creating the scanner 
         System.out.println("Enter the student marks:");   //prints the value
         System.out.println("Enter the Student Name:");
         if(i.hasNextInt() || i.hasNextLine())    //scanner methods
         {
             int marks= i.nextInt();
             String Name = i.next();   //string input
             if(marks <=100 || Name=="Sathvik")  //logical operator
             {
                System.out.println("Student passed on the Exam:");
                System.out.println("student name is sathvik:");
            }
            else
            {
                System.out.println("Student Failed on the exam:");    //prints the value if it is not true
                System.out.println("Student name is not Sathvik: ");

            }
        }
        else
        {
            System.out.println("The credentials entered is incorrect:");
            System.out.println("Student Sathvik is not found:");
        
        i.close();
        }
         
     }

    
}
