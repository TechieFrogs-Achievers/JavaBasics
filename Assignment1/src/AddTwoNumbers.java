import java.util.Scanner;
public class AddTwoNumbers {
        public static void main(String[] args) {

            Scanner s = new Scanner(System.in);
            int num1 = s.nextInt();
            int num2 = s.nextInt();
            int result = num1 + num2;
            System.out.println(result);
            s.close();
    }
}
