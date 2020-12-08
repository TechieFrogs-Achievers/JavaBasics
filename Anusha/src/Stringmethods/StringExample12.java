package Stringmethods;
import java.util.*;
public class StringExample12 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);              //scanner class for giving input from user
        String str = scan.nextLine();                       //creating string 
        str = str.replace(" ", "@");                        //replace space with any character
        System.out.println(str);
        scan.close();

    }
}
