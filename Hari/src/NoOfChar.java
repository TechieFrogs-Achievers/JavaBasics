import java.util.Scanner;
public class NoOfChar 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String : ");
        String string = sc.nextLine();
        System.out.println("Number of characters = : " + string.length());
        sc.close();
    }
}
