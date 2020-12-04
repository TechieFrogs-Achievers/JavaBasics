import java.util.Scanner;
public class DupChar 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        for( int i = 0 ; i < str.length() ; i++ )
        {
            for ( int j = 1 ; j < str.length() ; j++ )
            {
                if( str.charAt(i) == (str.charAt(j)))
                {
                    System.out.println(str.charAt(i));
                }

            }
        }
        sc.close();
    }   
}
