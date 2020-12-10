package AbstractExercises;
// Abstract class
abstract class Shape1
{   
    // Abstract methods with parameters
    abstract void RectangleArea(int legnth, int breadth);
    abstract void SquareArea( int side);
    abstract void CircleArea( float radius);
}
//Another class
class Areas extends Shape1// inheriting properties from Shape1
{
    void RectangleArea(int length, int breadth)// Method for RectangleArea
    {
        System.out.println(length*breadth);
    }
    void SquareArea( int side)// Method for SquareArea
    {
        System.out.println(side*side);
    }
    void CircleArea(float radius)// Method for CircleArea
    {
        System.out.println(3.14*radius*radius);
    }   
}
public class AbstractProgrm6
{
    public static void main(String[] args) 
    {   
        // upcasting
        Shape1 a = new Areas();
        // calling method with object
        a.RectangleArea(12, 6);
        a.SquareArea(9);
        a.CircleArea(5);

        
    }
    
}

    

