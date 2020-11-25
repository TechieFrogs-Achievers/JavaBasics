//package Methods;

//class for print area of rectangle and square
public class MethodExample2 
{
    //method for printing area of rectangle
    public void area(float length, float breadth)
    {
        float area = length * breadth;
        System.out.println("The area of rectangle is " +area);
    }
    //method for printing area of square
    public void area(int side)
    {
        int area = side * side;
        System.out.println("The area of a square is " +area);
    }

    public static void main(String[] args) {
        MethodExample2 me2 = new MethodExample2();      //object creation
        me2.area(2.4f, 4.5f);                       //method calling
        me2.area(6);
    }
    
}
