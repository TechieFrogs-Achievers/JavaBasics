package StringsExercise;

import java.util.Scanner;

public class Example12 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);                  //scanner method
        String str = scan.nextLine();                           //string value is taken by run time
        StringBuffer sb = new StringBuffer(str);                //creating string buffer
        System.out.println("The user string: " +sb);            //printing users string
        sb.delete(0, str.length());                                //clearing the given string
        System.out.println("The cleared StringBuffer is: " +sb);    //printing the clear string
        scan.close();
        
    }
    
}
