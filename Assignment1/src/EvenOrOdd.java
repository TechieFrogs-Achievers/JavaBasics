import java.util.Scanner;
public class EvenOrOdd {
    public void evenOdd(int x)
    {
        if (x%2 == 0)
            System.out.println("Even Number");
        else
            System.out.println("Odd number");
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        EvenOrOdd obj = new EvenOrOdd();
        obj.evenOdd(n1);
        s.close();
    }
}
