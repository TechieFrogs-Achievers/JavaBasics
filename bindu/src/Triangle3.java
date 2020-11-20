public class Triangle3 {
    int a=4,b=5,c=7;
    void Area()
    {
        double s=(a+b+c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println(area);
    }
    void Perimeter()
    {
        double Perimeter=(a+b+c);
        System.out.println(Perimeter);
    }
    public static void main(String[] args) {
        Triangle3 t= new Triangle3();
        t.Area();
        t.Perimeter();
    }
}
