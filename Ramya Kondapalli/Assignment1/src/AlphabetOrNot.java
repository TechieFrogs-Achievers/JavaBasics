//package dto;
import java.util.Scanner;
public class AlphabetOrNot {
    public static void main(String[] args) {
     
        Scanner s = new Scanner(System.in);
        char data = s.next().charAt(0);
        char ch = Character.toLowerCase(data);
        if (ch >= 'a' && ch <='z')
            System.out.println("Entered character is Alphabet");
        else
            System.out.println("Character is not an Alphabet");

        s.close();

    }
}
