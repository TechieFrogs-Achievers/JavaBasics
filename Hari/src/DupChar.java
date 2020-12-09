import java.util.Scanner;
public class DupChar 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        char string[] = str.toCharArray();
        for( int i = 0 ; i < str.length() ; i++ )
        {
            int count = 1;
            for(int j = 1 ; i < str.length() ; j++)
            {
            if(string[i] == string[j])
            {
                count++ ;
                string[j] = '0' ;
            }
            }
        if(count > 1 && string[i] != '0')
        System.out.println(string[i]);
        sc.close();
        }
    }   
}
