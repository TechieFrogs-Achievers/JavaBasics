import java.util.Scanner;

class Average{

    public void calculate(int x,int y,int z)
    {
        int sum= x+y+z;
        float average = sum/3;
        System.out.println(average);
    }
}
public class ConstructorProgram8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        Average avg = new Average();
        avg.calculate(a,b,c);

    }
}
