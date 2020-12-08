import java.util.Scanner;
public class String117 
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string : ");
        String string = sc.nextLine();
        for(int i = 0 ; i < string.length() ; i++)
        {
            System.out.println(string.charAt(i));
        }
        sc.close();
    }   
}
