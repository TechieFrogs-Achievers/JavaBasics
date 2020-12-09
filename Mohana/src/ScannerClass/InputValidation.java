package ScannerClass;

import java.util.Scanner;

public class InputValidation 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter your input");
       Scanner sc = new Scanner(System.in);

         while(!sc.hasNextInt())//condition whether the input is int or not
         {
             System.out.println("Please enter valid input ");
              sc.next();//moves to next input 
         }
        int num = sc.nextInt();
        if(num <=0)//to check input is negative or positive 
        {
            System.out.println("entered negative number :" +num);

            
        }  
        else{
            System.out.println("input is positive  number : " +num);
            
        }
         sc.close();
        
         
    }
    
}
