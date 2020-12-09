package StringsExercise;

import java.util.Scanner;

public class Example1 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);                 //scanner method
        String str = s.nextLine();                  //string value taking
        int n = str.length();                          //length() gives string length
        System.out.println("The length is " +n);
        s.close();
        
    }
    
}
