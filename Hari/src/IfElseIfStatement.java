public class IfElseIfStatement 
{
    public static void main(String []args)
    {
        int pen = 57 ;
        if (pen > 0)
        System.out.println("Positive");
        else if (pen < 0)
        System.out.println("Negative");
        else 
        System.out.println("Zero");


        char ch = 'H';
        if ( ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
        System.out.println("Vowel");
        else if ( ch == 'K' || ch == 'H' || ch == 'P')
        System.out.println("Required Consonant");
        else 
        System.out.println("Consonants");
    }  
}
