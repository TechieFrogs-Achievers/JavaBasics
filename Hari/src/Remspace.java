import java.util.Scanner;
public class Remspace 
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string : ");
        String string = sc.nextLine() ;
        System.out.println(string.replace(" ", "")); 
        sc.close();
    }
}
