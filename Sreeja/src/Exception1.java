import java.util.*;
public class Exception1 
{
    
    //static method to print the sum of two integers
    
    static void sum()       
    {
        Scanner sc = new Scanner(System.in);        //create scanner class object
        
        //code to be checked for an exception
        try     
        {
            //enter the values from user
        
            int a = sc.nextInt();
            int b = sc.nextInt();
        System.out.println("Sum is "+" "+(a+b));
        }
        catch(Exception e)          //to handle the exception
        {
            System.out.println("Given values are invalid");
            
        }
        

        sc.close();
    }
    
    
    public static void main(String[] args) 
    {
        System.out.println("enter two numbers");
        Exception1.sum();           //method calling
        
    }
    
    
}
