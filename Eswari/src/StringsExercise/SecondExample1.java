package StringsExercise;
import java.util.Scanner;

public class SecondExample1 
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count =0;
        String str = scan.nextLine();
        for(int i=0; i < str.length(); i++)
        {
            if(str.charAt(i) != ' ')
            {
                count++;
            }
        }
        System.out.println("The count of characters in a sentance is " +count);
        scan.close();

    }
    
}
