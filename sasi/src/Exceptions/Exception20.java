package Exceptions;

import java.util.Scanner;

public class Exception20 
{
    public static void main(String[] args) 
    { 
        Scanner sc =new Scanner(System.in);    //scanner class object
        String str = sc.nextLine();   //string creation
        try
        {
            int num = Integer.parseInt(str);   //converting the string value to the integer
            System.out.println("convereted number is:"+num);
        }
        catch(NumberFormatException nf)   //catch block that handles the exception from the try block
        {
            System.out.println("cann't convert string to integer:");
        }
        System.out.println("rest of the program:");   //prints the end
        sc.close();  //scanner close
        
        
    }
    
}
