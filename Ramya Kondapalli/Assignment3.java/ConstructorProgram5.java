class Reactangle{
    int length;
    int breadth;
    int area;
    public Reactangle(int l,int b)
    {
        length =l;
        breadth =b;
    }
    public int area()
    {
        return length*breadth;
    }
    public int perimeter()
    {
        return 2*(length+breadth);
    }

}
public class ConstructorProgram5 {
    public static void main(String[] args) {
        Reactangle r1 = new Reactangle(4,5);
        Reactangle r2 = new Reactangle(5,8);
        System.out.println("Area of reactangle : " + r1.area + " Perimeter of Reactangle : " + r1.perimeter());
        System.out.println("Area of reactangle : " + r2.area + " Perimeter of Reactangle : " + r2.perimeter());
    }
}
