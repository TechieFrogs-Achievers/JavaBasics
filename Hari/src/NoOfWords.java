import java.util.Scanner;
public class NoOfWords 
{
    public static void main(String[] args)
    {
        int count = 0 ;
        int words ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your sentence : ");
        String str = sc.nextLine();
        for ( int i = 0 ; i < str.length() ; i ++ )
        {
            if (str.charAt(i) !=' ') 
            {
                count++ ;
            }
        }
        words = str.length() - count + 1 ;
        System.out.println("Number of words in the sentence = " + words);
        sc.close();
    }   
}
