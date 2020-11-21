import java.util.Scanner;

class Area1{
    int length,breadth;
    public Area1(int l, int b) {
        length = l;
        breadth = b;
    }
    public int returnArea()
    {
        return length*breadth;
    }

}
public class ConstructorProgram7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int l = s.nextInt();
        int b = s.nextInt();
        Area1 r = new Area1(l,b);
        System.out.println("Area of Reactangle : "+ r.returnArea());

    }
}
