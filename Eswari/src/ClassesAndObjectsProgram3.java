// Triangle class printing area and perimeter for triangle

class Triangle
{
    int side1=3,side2=4,side3=5;  //these are the values for sides of a triangle

    //triangle constructor
    protected Triangle()
    {
        int a,b,c;
        a=side1;
        b=side2;
        c=side3;
        
    }

    // method for diplaying area of a triangle
    void areaDisplay()
    {
        double s=(side1 + side2 + side3)/2;
        double area=Math.sqrt(s * (s- side1) * (s- side2) * (s- side3));
        System.out.println(area);

    }
    // method for displaying perimeter of a triangle
    void perimeterDisplay()
    {
        int perimeter= (side1 + side2 + side3 );
        System.out.println(perimeter);
    }

}

// this is the main class
public class ClassesAndObjectsProgram3 {
    public static void main(String[] args) {
        Triangle t= new Triangle();    //object creation
        t.areaDisplay();  //method calling by using object
        t.perimeterDisplay();    //method calling by using object
    }
    
}
