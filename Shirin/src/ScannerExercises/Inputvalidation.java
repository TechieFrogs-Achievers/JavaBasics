package ScannerExercises;
import java.util.*;



public class Inputvalidation 
{
    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);//creating object
       /* System.out.println("Enter the student marks");// e
         if(obj.hasNextInt())
         {
             //int m = obj.nextInt();
             System.out.println("the student is pass"+ " "+obj.hasNextInt());
         
          int m = obj.nextInt();
         while (m >= 50)
         {
             System.out.println(" the student is fail"+" "+obj.hasNextInt());
         }
        }*/
        System.out.println(" Enter a number :");
        if (obj.hasNextLine())
        {   
             int num = obj.nextInt();
             while(num < 1 || num > 200)
             {

                System.out.println(" please enter a valid number !!!");
                System.out.println("Enter a number");
                num =  obj.nextInt();
                System.out.println(" your number :" + num);
             }
        }
        else
        {
            System.out.println(" xxx... Your entering wrong number ....xxx");
  
        }
        obj.close();
        
        
          

        
    }
    
}
