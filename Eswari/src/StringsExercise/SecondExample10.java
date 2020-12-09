package StringsExercise;

import java.util.Scanner;

//class for removing white spaces in a string
public class SecondExample10 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);              //scanner class for taking input through keyboard
        String str = scan.nextLine();                       //string creation
        //StringBuffer sb= new StringBuffer(str);
        str = str.replaceAll("\\s", "");                    //removing all white spaces
        System.out.println("The string is :" +str);
        scan.close();                                       //scanner class close
    }

    
}
