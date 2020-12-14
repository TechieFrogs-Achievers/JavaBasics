package ExceptionsExercises;

//import java.io.IOException;
import java.util.Scanner;
//import java.lang.Throwable;

public class Numberformat 
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);    //scanner class 
        String str = sc.nextLine();   //string variable
        // try block
        try
        {
            int num = Integer.parseInt(str);   //converting the string value to the integer
            System.out.println("convereted number is:"+num);
        }
        //catch block
        // it handles exception
        catch(NumberFormatException nf)   
        {
            System.out.println("can't convert the string into integer:");
        }
        System.out.println("rest of the program excecutes");   //prints the end
        sc.close();  //scanner close
        
    }
    
}
