import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {

        Scanner s = new Scanner (System.in);
        int number = s.nextInt();
        int i=1,r=1;
        while(i<=number)
        {
            r = r*i;
            i++;
        }
        System.out.println(r);
        
        s.close();
    }
}
