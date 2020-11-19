import java.util.Scanner;

public class GcdWithForLoop {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int gcd =1;

        for (int i=1; i<=num1 && i<=num2; i++)
        {
            if(num1%i == 0 && num2%i == 0)
            gcd =i;
        }
        System.out.println(gcd);

        s.close();
    }
}
