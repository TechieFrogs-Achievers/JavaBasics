class Rectangle1 //class name Rectangle
{
    int length;
    int breadth;
Rectangle1(int l , int b)
{
    length =l;
    breadth=b;
}
void Area() //create method 
{
    System.out.println("the area is :" +length*breadth); //calling area of rectangle(l*b)
}
void Perimeter() // creating method for perimeter  
{
    System.out.println("the perimeter is:" +(2*(length+breadth))); //calling perimeter of rectangle(2*(l+b))
}
}
class Square extends Rectangle1 //inherits square by class name
{
    int side;
    Square(int s)
    {
        super(s,s); //calling constructor of parent class by using super
    }
    void AreaSquare() //create method for areasquare
    {
        int area = side*side; //formula of area(s*s)
        System.out.println(area);
    }
    void PerimeterSquare() 
    {
        int Perimeter =(4*side);
        System.out.println(Perimeter);
    }
}

public class AreaofTriangleinheritance4 //main class for creating the objects
{
    public static void main(String[] args) 
    {
        Rectangle1 r = new Rectangle1(6,8); //creating object by the class name
        r.Area(); //calling method by the object
        r.Perimeter();
        Square s = new Square(6); 
        s.Area();
        s.Perimeter();
        
    }
}






    

