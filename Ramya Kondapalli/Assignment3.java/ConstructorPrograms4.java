class Triangle1{
    int a,b,c;
    public Triangle1(int x,int y,int z)
    {
        float s = (float) (0.5* x*y);
        double area = Math.sqrt((s - a) * (s - b) * (s - c));
        System.out.println("Area of triangle" + area);
        int perimeter = x+ y+z;
        System.out.println("Perimeter of triangle : " + perimeter);
    }
}
public class ConstructorPrograms4 {
    public static void main(String[] args) {
    Triangle1 t = new Triangle1(3,4,5);
    }
}
