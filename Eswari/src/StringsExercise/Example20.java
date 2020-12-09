package StringsExercise;

import java.util.Scanner;

public class Example20 
{
    public static void main(String[] args) {
        // String str = "hai this is eswari";
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String s = scan.next();
        int value = str.indexOf(s);
        if(value == -1)
        {
            System.out.println("Substring is not there");
        }
        else
        {
            System.out.println("Substring is present");
        }
        scan.close();
    }
    
}
