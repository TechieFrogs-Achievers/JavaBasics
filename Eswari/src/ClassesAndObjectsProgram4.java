class Triangle1
{
    int a,b,c;
    Triangle1(int side1,int side2,int side3)
    {
        a=side1;
        b=side2;
        c=side3;

    }
    public void areaDisplay()
    {
        double s=(a + b + c)/2.0;
        double area= Math.sqrt(s * (s -a)*(s -b)*(s-c));
        System.out.println("Area is : "+area);
    }
    public void perimeterDisplay()
    {
        int perimeter= (a + b + c);
        System.out.println("Perimeter is "+perimeter);
    }
}

public class ClassesAndObjectsProgram4 {
    public static void main(String[] args) {
        Triangle1 t= new Triangle1(3, 4, 5);
        t.areaDisplay();
        t.perimeterDisplay();
    }
}
