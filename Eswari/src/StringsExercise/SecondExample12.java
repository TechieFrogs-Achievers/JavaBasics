package StringsExercise;

import java.util.Scanner;

//class for replacing spaces with a specific character
public class SecondExample12 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);              //scanner class for giving input from user
        String str = scan.nextLine();                       //creating string 
        str = str.replace(" ", "@");                        //replace space with any character
        //StringBuffer sb = new StringBuffer(str);
        //sb.replace(" ", "@");
        System.out.println(str);
        scan.close();
        
    }
    
}
