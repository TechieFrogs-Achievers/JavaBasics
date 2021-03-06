package PracticeExcercises;

import java.util.Scanner;

public class Oddnumbers 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);      // scanner class
        System.out.println("Enter the number:");
        int num = sc.nextInt();                   // method for taking input from users
        //int arr[] =new int[num];
        int odd=0;    // declaring variable for odd numbers
        for( int i = 100; i < num; i++)     // loop for checking the every numbers f
        {
            if( i % 2 !=0)      // odd numbers method
            {
                odd = odd+i;     // calculating sum of odd numbers
                //System.out.println(i);      // print all odd numbers
            }
        }
        System.out.println( " The sum  of number by given number : " +odd);   // it print  sum of odd numbersa
        sc.close();    //scanner class close

        
    }
    
}
