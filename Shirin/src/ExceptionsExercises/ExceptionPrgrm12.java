package ExceptionsExercises;

import java.util.Scanner;

public class ExceptionPrgrm12 
{
    public static void main(String[] args)
    {   
        System.out.println(" Enter the string");
        Scanner sc = new Scanner(System.in);    // scanner class
        String str = sc.nextLine();       //Initiallizing variable
        // try block
        try
        {
            Class.forName("");    // method for requesting the class
            System.out.println(str);
        }
        //catch block
        // it handles exception
        catch(ClassNotFoundException ce)   
        {
            ce.printStackTrace();   // method for showing exception include line and class name
        }
        sc.close();    // scanner class close
        
    }
    
}
