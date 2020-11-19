import java.util.Scanner;

public class MultiplicationWithWhileLoop {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i=0;
        while(i<=10)
        {
            System.out.println(n + " * " + i + " = " + (n*i));
            i++;
        }
        s.close();

    }
}
