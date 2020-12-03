import java.util.Scanner;
public class RevStr 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String : ");
        String str = sc.nextLine();
        String rev = "";
        char ch[] = str.toCharArray();
        for ( int i = ch.length -1 ; i >= 0 ; i-- )
        {
            rev = rev + ch[i] ;
        }
        System.out.print(rev);
        sc.close();
    }
}
