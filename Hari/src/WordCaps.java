import java.util.Scanner;
public class WordCaps 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any sentence : ");
        String string = sc.nextLine();
        string = string.toUpperCase();
        System.out.println(string);
        sc.close();
    }   
}
