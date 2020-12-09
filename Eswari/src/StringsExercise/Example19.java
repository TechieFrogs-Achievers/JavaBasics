package StringsExercise;

import java.util.Scanner;

public class Example19 
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);                      //scanner method
        String str = scan.nextLine();                               //string value given by run time using scanner
        String s = scan.next();

        //contains method is used for checking the substring is there in substring or not
        if(str.contains(s))                                         
        {
            System.out.println("Substring contains in main String");
        }
        else                                                            //if block condition is not true then else block is excuted
        {
            System.out.println("Substring is not there in main string");
        }
        scan.close();               //scanner close
    }
    
}
