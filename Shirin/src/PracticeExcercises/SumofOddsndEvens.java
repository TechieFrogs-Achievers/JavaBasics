package PracticeExcercises;

import java.util.Scanner;

public class SumofOddsndEvens 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);     // scanner class
        System.out.println("Enter the  number :");
        int num = sc.nextInt();    // method for taking input as integer
        int even = 0, odd = 0;
        for( int i = 1; i <= num ; i++)   // loop for checking the numbers
        {
            if( i % 2 == 0)     // statement for checking even numbers
            {
                even = even+i;
            }
            else
            {
                odd = odd+i;
            }
        }
            System.out.println(" the even numbers are :" + even);
            System.out.println(" the odd numbers are: "  + odd);
            sc.close();
        


        
    }
    
}
