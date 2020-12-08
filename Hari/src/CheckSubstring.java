import java.util.Scanner;
public class CheckSubstring 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string : ");
        String string = sc.nextLine();
        if(string.contains("ari"))
        {
            System.out.println("Yes.The string contains substring ari");
        }
        else {
            System.out.println("No. The string doesn't contain substring ari");
        }
        sc.close();
    }   
}
