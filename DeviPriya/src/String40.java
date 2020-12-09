import java.util.*;
public class String40 {
    public static void main(String[] args) {
        //String str = "This website is awesome.";
        char ch = 'e';
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int frequency = 0;

        for(int i = 0; i < str.length(); i++) {
            if(ch == str.charAt(i)) {
                ++frequency;
            }
        }

        System.out.println("Frequency of " + ch + " = " + frequency);
    }
    
}
