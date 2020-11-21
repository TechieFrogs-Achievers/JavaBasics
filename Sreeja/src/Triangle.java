public class Triangle
 {
    int side1 = 3;
    int side2 = 4;
    int side3 = 5;


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
        Triangle tr = new Triangle();
        tr.Area();
        tr.perimeter();
    }

}
