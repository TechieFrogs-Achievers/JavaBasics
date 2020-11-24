class Triangle
{
    int side1=3,side2=4,side3=5;

    //triangle constructor
     Triangle()
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
//void perimeterDisplay()

}
}

// this is the main class
public class ClassesAndObjectsProgram3 {
    public static void main(String[] args) {
        Triangle t= new Triangle();
        t.areaDisplay();
        t.perimeterDisplay();    
        Triangle t1= new Triangle();    //object creation
        t1.areaDisplay();  //method calling by using object
        t1.perimeterDisplay();    //method calling by using object
    }

}
