class Rectangle
{
    int l,b;
    Rectangle(int length, int breadth)
    {
        l=length;
        b=breadth;
    }
    void areaDisplay()
    {
        int area=l * b;
        System.out.println(area);
    }
    void perimeterDisplay()
    {
        int perimeter= 2 * (l + b);
        System.out.println(perimeter);
    }
}

public class ClassesAndObjectsProgram5 {
    public static void main(String[] args) {
        Rectangle r= new Rectangle(4, 5);
        Rectangle r1= new Rectangle(5, 8);
        r.areaDisplay();
        r.perimeterDisplay();
        r1.areaDisplay();
        r1.perimeterDisplay();    
    }
    
}
