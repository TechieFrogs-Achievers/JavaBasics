package ExceptionsExercise;

import java.util.Scanner;

//class to handle cloneNotSupportException

//class to write method in separate class
class Demo
{
    void ageDisplay(int age)            //method for checking age
    {
        //if age is not in between 1- 100 then illegalArgumentException throws
        if(age > 100 || age < 0)            
        {
            throw new IllegalArgumentException("Invalid age");
        }
        //if age is between 1 - 100 then it prints your age
        else
        {
            System.out.println("Your age is : " +age);
        }
    }
}
//driver class
public class Example18 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);                  //scanner class for taking input from user
        System.out.println("Enter your age: ");
        int age = scan.nextInt();                       //taking age from user
        Demo demo = new Demo();                         //object creation
        demo.ageDisplay(age);                       //calling method
        scan.close();                               //scanner close
        
    }
}
