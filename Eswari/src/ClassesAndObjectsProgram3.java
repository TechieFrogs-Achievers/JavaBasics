class Triangle
{
    int side1=3,side2=4,side3=5;
    Triangle()
    {
        int a,b,c;
        a=side1;
        b=side2;
        c=side3;
        
    }
    void areaDisplay()
    {
        double s=(side1 + side2 + side3)/2;
        double area=Math.sqrt(s * (s- side1) * (s- side2) * (s- side3));
        System.out.println(area);

    }
    void perimeterDisplay()
    {
        int perimeter= (side1 + side2 + side3 );
        System.out.println(perimeter);
    }

}

public class ClassesAndObjectsProgram3 {
    public static void main(String[] args) {
        Triangle t= new Triangle();
        t.areaDisplay();
        t.perimeterDisplay();    
    }
    
}
