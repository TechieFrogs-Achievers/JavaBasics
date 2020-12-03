package I.OStream;

import java.util.Scanner;

public class Example3 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);                 //scanner input stream
        System.out.println("Enter a string: ");
        String str = s.nextLine();                      //string value creating using scanner object
        System.out.println(str);
        s.close();   
    }
    
}
