package PracticeExcercises;

import java.util.Scanner;

public class Factorial 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);   // scanner class
        int number= sc.nextInt();             // method for giving input
         
        int fact=1;                       // integer
          
        for(int i=1;i<=number;i++)       // loop for checking number
        {    
            fact= fact*i;               // method for calculating factorial number
        }    
        System.out.println("Factorial of number is: "+fact);  
        sc.close();     // scanner class close
      

        
    }
    

    
}
