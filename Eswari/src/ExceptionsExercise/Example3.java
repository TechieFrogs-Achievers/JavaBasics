package ExceptionsExercise;

import java.util.Scanner;

//class to handle exception handling through thow keyword
public class Example3
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);                  //scanner class for taking input from user
        System.out.println("Enter the student id : ");  
        int stdId = scan.nextInt();                         //taking student id from user
        //if condition for checking that student is eligible for that class or not
        if(stdId > 500 && stdId < 600)
        {
            //if condition is true then it prints that eligible for that class
            System.out.println("The student is eligible for that particular class");
        }
        //if id is not in limit then it throw exception as not eligible
        else
        {
            throw new ArithmeticException("Student is not eligible for that class");
        }
        System.out.println("End of throw exception");           //end ststement
        
    }
}
