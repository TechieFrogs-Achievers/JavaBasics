package StringsExercise;
import java.util.Scanner;

public class Example18 
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        //StringBuffer sb = new StringBuffer(str);
        for(char c : str.toCharArray())
        {
            // System.out.println(c);
            System.out.print(c);
        }
        scan.close();
    }
    
}
