public class CheckingCharacter
 {
     public static void main(String[] args)
    {
        char ch = 'S';
        int char1 = (int)ch;

        if((char1>=65&&char1<=90)||(char1>=97&&char1<=122))
        {
            System.out.println("The character is an Alphabet");
        }
        else 
        {
            System.out.println("The character is not an Alphabet");
        }


        
    }
}
