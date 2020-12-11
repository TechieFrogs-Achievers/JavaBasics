package ExceptionsExercise;

import java.util.Scanner;

//class for nested try blocks
public class Example6 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);          //scanner class for taking input from user
        String str = scan.next();                   //taking string from console
        int length = scan.nextInt();                //taking length from console
        int array[] = new int[length];              //creating array
        for(int i =0 ; i < length;i++)              //loop for reading array elements
        {
            array[i] = scan.nextInt();
        }
        //outer try block
        try
        {
            str = null;
            System.out.println("The length o string is : " +str.length());
             //inner try block
            try        
            {
                System.out.println("The array element is : " +array[length+1]);
            }
            //inner catch block
            catch(ArithmeticException ae)
            {
                System.out.println("The exception is : " +ae);
            }
            //inner catch block
            catch(ArrayIndexOutOfBoundsException ai)
            {
                System.out.println("Exception is : " +ai);
            }
        }
        //outer catch block
        catch(NullPointerException np)
        {
            System.out.println("Exception is : " +np);

        }
        //last statement for program
        System.out.println("End of program");
        scan.close();           //scanner close
        
    }
    
}
