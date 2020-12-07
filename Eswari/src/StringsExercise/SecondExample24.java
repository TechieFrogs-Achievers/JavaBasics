package StringsExercise;

import java.util.Scanner;

//class for swapping two strings without using third variable
public class SecondExample24 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);              //scanner class for taking input from user
        //creating two strings for swapping 
        String str1 = scan.next();                  //"rama"
        String str2 = scan.next();                   //"eswari"
        
        //swapping formula for strings
        str1 = str1 + str2;                                                 //str1 = "ramaeswari"
        
        //str1.substring(0,(10 - 6)) => str2= "rama"
        str2 = str1.substring(0,(str1.length() - str2.length()));

        //previous str2 length is 4 i.e rama
        //str1.substring(4) => from 4th index string is printed => str1= eswari
        str1 = str1.substring(str2.length());

        //pring that swapped strings
        System.out.println(str1 + " " +str2);
        scan.close();
        
    }
    
}
