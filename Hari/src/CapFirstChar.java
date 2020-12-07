import java.util.Scanner;
public class CapFirstChar
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any sentence : ");
        String string = sc.nextLine();
        String words[] = string.split(" ");
        String capWord = "";
        for(String w : words )
        {
            String first = w.substring(0,1);
            String remaining = w.substring(1);
            capWord += first.toUpperCase() + remaining + " " ;  
        }
        System.out.println(capWord.trim());
        sc.close();
    }   
}
