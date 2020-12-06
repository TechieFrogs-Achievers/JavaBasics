//package StringsExercise;
package StringsExercise;
import java.util.Scanner;

public class SecondExample4 
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        StringBuffer sb = new StringBuffer(str);
        int vowelsCount=0;
        int consonantsCount=0;
        for(int i=0; i < str.length(); i++)
        {
            if(sb.charAt(i) == 'a' || sb.charAt(i) == 'e' || sb.charAt(i) == 'i' || sb.charAt(i) == 'o' || sb.charAt(i) == 'u' || 
            sb.charAt(i) == 'A' || sb.charAt(i) == 'E' || sb.charAt(i) == 'I' || sb.charAt(i) == 'U' || sb.charAt(i) == 'O' )
            {
                vowelsCount++;
            }
            else
            {
                consonantsCount++;
            }

        }
        System.out.println("The number of vowels in sentance is " +vowelsCount);
        System.out.println("The number of consonants in a sentance is " +consonantsCount);
        scan.close();
        
            
    }
        
}
