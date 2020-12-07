package StringsExercise;

import java.util.Scanner;

public class Example13 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);              //scanner method
        String str = scan.nextLine();                       //string value is taken by user
        StringBuffer sb = new StringBuffer(str);            //stringbuffer creating
        System.out.println("The users string is " +sb);
        sb.setLength(0);                                    //clear the data in string  using setLength() method
        System.out.println("The string is " +sb);
        scan.close();                                       //scanner close
    
        
    }
    
}
