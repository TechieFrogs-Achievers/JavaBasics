package Inheritance;

//rectangle class 
class Rectangle 
{
    int length;
    int breadth;
    //for displaying area of rectangle
    public void areaDisplay()
    {
        int area = length * breadth;
        System.out.println(area);
    }
    //for displaying perimeter of rectangle
    public void perimeterDisplay()
    {
        int perimeter = 2 * (length + breadth);
        System.out.println(perimeter);
    }
    //constructor
    Rectangle(int l, int b)
    {
        length = l;
        breadth = b;

    }
}

//square class
class Square extends Rectangle
{
    int side;
    Square(int s)
    {
        super(s,s);

    }
    // public void areaSquareDisplay()
    // {
    //     int area = side * side;
    //     System.out.println(area);
    // }
    // public void perimeterSquareDisplay()
    // {
    //     int perimeter = 4 * side;
    //     System.out.println(perimeter);
    // }

    // public Square() {
    // }

}


public class InheritanceExampleForRectangle 
{
    public static void main(String[] args) {
        Rectangle r = new Rectangle(4,5);
        r.areaDisplay();
        r.perimeterDisplay();
        Square s = new Square(5);
        s.areaDisplay();
        s.perimeterDisplay();
        
    }    
}
