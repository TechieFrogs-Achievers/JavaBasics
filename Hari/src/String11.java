import java.util.Scanner;
public class String11 
{
    public static  void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int vowel = 0 , digit = 0 , consonant = 0 , space = 0 ;
        System.out.println("Enter any string : ");
        String str = sc.nextLine();
        str = str.toLowerCase();
        for(int i = 0 ; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if( ch == ' ')
            {
                space++ ;
            }
            else if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                vowel++ ;
            }
            else if( ch >= 0 && ch <= 9 )
            {
                digit++ ;
            }
            else if( ch >= 'b' && ch <= 'z')
            {
                consonant++ ;
            }
        }
        System.out.println("No.of digits = " + digit);
        System.out.println("No.of vowels = "+ vowel);
        System.out.println("No.of consonants = " + consonant);
        System.out.println("No.of spaces = " + space);
        sc.close();
    }   
}
