import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("before swapping :");
        int num1 = s.nextInt();
        int num2 = s.nextInt();

        int temp = num1;
        num1= num2;
        num2= temp;
        System.out.println("After swapping :");
        System.out.println(num1);
        System.out.println(num2);
        s.close();

    }
}
