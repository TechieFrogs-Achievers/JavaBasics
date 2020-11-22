public class Triangle2
 {
    
    int side1;
    int side2;
    int side3;

    Triangle2(int a,int b,int c)
    {
     side1 = a;
     side2 = b;
     side3 = c;
    }

    void Area()
    {
        double s=(side1+side2+side3)/2;
        double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        System.out.println(area);
    }
    void perimeter()
    {
        double perimeter = side1+side2+side3;
        System.out.println(perimeter);
    }

     public static void main(String[] args) 
     {
        Triangle2 tr = new Triangle2(3,4,5);
        tr.Area();
        tr.perimeter();
    }
}
