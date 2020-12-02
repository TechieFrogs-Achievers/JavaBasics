package ScannerClass;

import java.util.Scanner;

public class InputValidation 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        //boolean stop = false;
        while(true)
        {   

        System.out.println("Enter your input");
        if(!sc.hasNextInt())
        {  
            System.out.println("you entered wrong input");
           
          
        }  
        
        else{ 
            int n = sc.nextInt();
            System.out.println("Entered int value " +n);
        }  

        continue;
    
       }
        
         
    }
    
}
