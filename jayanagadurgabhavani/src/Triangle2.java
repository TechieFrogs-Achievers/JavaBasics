public class Triangle2
 {
    int a,b,c;
    Triangle2(int side1,int side2,int side3)
    {
        a=side1;
        b=side2;
        c=side3;

    }
    public void areaDisplay()
    {
        // triangle farmula s=(+b+c)/2
        //area= Math.sqrt(s * (s -a)*(s -b)*(s-c));
        double s=(a + b + c)/2.0;
        double area= Math.sqrt(s * (s -a)*(s -b)*(s-c));
        System.out.println("trianglerea is : "+area);
    }
    public void perimeterDisplay()
    {
        int perimeter= (a + b + c);
        System.out.println("Perimeter is "+perimeter);
    }


    public static void main(String[] args) 
    {
        Triangle2 t= new Triangle2(3, 4, 5);
        t.areaDisplay();
        t.perimeterDisplay();
    }

}
