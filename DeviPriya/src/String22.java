import java.util.*;
public class String22 {
    public static void main(String []args) {
        //String str = "amit";
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        System.out.println("String: "+s);
        for (int i = 0; i < s.length(); i++) {
           if (Character.isLetter(s.charAt(i)))
           count++;
        }
        System.out.println("Letters: "+count);
     }
    
}
