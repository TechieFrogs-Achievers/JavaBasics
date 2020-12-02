package ScannerClass;
import java.util.Scanner;
public class Example2 
{
      public static void main(String[] args) 
      {
         Scanner obj = new Scanner(System.in); //sacner obj creation 
         
         System.out.println("Enter your input");

         if(obj.hasNextInt()) //condtion to check whether the given input is int or not
         { 
            int val = obj.nextInt();
            System.out.println("Entered int value is " +val);
         }
          else{
            System.out.println("Entered wrong input");

          }

         /* if(obj.hasNextDouble()) //condition to check double value is gien in next statement or not 
          {    
              //but here automatic type promotion is done
              double value = obj.nextDouble(); //input from keyboard
              System.out.println("Entered double value : " +value);
          }  

          else{
              System.out.println("please provide double value only");
          }*/
      }
    
}
