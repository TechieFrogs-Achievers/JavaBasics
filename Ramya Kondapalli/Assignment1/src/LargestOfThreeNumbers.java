import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static int largest(int x,int y, int z)
    {
        if ((x>y) && (x>z))
            return x;
        else if ((y>x) && (y>z))
            return y;
        else 
            return z;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int large = largest(a, b, c);
        System.out.println(large + " is the largest number");
        s.close();
        
    }
}
