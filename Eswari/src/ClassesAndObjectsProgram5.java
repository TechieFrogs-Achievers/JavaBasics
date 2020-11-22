// rectangle class for calculating area and perimeter of rectangle
class Rectangle
{
    int l,b;

    // parametarized contructor
    Rectangle(int length, int breadth)
    {
        l=length;
        b=breadth;
    }

    // method for calculating area of rectangle
    void areaDisplay()
    {
        int area=l * b;
        System.out.println(area);
    }

    // method for calculating perimeter of rectangle
    void perimeterDisplay()
    {
        int perimeter= 2 * (l + b);
        System.out.println(perimeter);
    }
}

public class ClassesAndObjectsProgram5 {
    public static void main(String[] args) {
        Rectangle r= new Rectangle(4, 5);   //object creation
        Rectangle r1= new Rectangle(5, 8);  //object creaation
        r.areaDisplay();   //method calling
        r.perimeterDisplay();  //method calling
        r1.areaDisplay();     //method calling
        r1.perimeterDisplay();    //method calling
    }
    
}
