package AbstractExercises;
// Abstract class
abstract class Shapess
{   
    //data types using protected access specifier
    protected  String color;
    protected boolean filled;
    //Abstract method
    Shapess()
    {

    }
    Shapess(String c, boolean f)//method with parameter
    {  
         color = c;
         filled = f;
  
    }
    //Accesor method
     public String getcolor()
    {
        return color;
    }
    // mutuator method
     public void setcolor(String c )
    {
        color = c;

    }
    //Accesor method 
      public boolean  isfilled()
    { 
        return filled;   
    }
    // mutuator method
     public  void setfilled(boolean f)
     {
          filled = f;
     }
     abstract double getArea();
     abstract double getperimeter();

     public String toString()
     {
         return color+" "+filled;
     }
}
// sub class 1
class Circle1 extends Shapess 
{
     protected double radius;
    //default constructor
    Circle1()
    {

    }
    //constructor with parameter
    Circle1(double r)
    {
        radius = r;
    }
    Circle1(double r, String c , boolean f )
    {
        super(c , f);
        radius = r;

    }
    //Accesor method for return radius
    public double getradius()
    {
        return radius;
    }
    // mutuator method
    public void setradius( double r)
    {
        radius = r;
    } 
    // Accesor Method for Area
     public  double getArea()
     {
         return 3.14*radius*radius;
     }
    //accesor Method
     public double getperimeter()
     {
         return 2*3.14*radius;
     }

}
// sub class 2
class Rectangle1 extends Shapess 
{
     protected double Width;
     protected double length;
    //default constructor
    Rectangle1(String c, boolean f)
    {

    }
    //constructor with parameter
    Rectangle1(double w, double l)
    {   
        Width = w;
        length = l;
    }
    Rectangle1(double w, double l, String c , boolean f )
    {
        super(c , f);
        Width =w;
        length = l;
    }
    
    public Rectangle1() {
    }

    // Accesor method for return radius
    public double getWidth()
    {
        return Width;
    }
    // mutuator method
    public void setWidth( double w)
    {
        Width = w;
    }
    public double getlength()
    {
        return length;
    }
    // mutuator method
    public void setlength( double l)
    {
        length = l;
    } 
    // Accesor Method for Area
     double getArea()
     {
         return  (length*Width);
     }
    //accesor Method
     double getperimeter()
     {
         return 2*(length*Width);
     }
      public String toString()
     {
         return  color+" "+filled+" "+Width+" "+length;

     }
}
 // sub class for rectangle
 class Square extends  Rectangle1//inheriting properties from rectangle
{   
     protected double side;
     // default constructor
     public Square()
     {

     }
     
     Square(double s)
    { 
        super();   
        side = s;
    
    }
    Square( double s , String c , boolean f )
    {
        super(c , f);// it calls the parent super class constructor
        side = s;
    }
    //Accesor method  return side of the square
    public double getside()
    {
        return side;
    }
    // mutuator method
    public void setside( double s)
    {
        side = s;
    }
    public void setWidth( double w)
    {
        Width = w;
    } 
    public void setlength(double l)
    {
        length = l;
    }
    public String toString() // string method
    {
        return color+" "+filled+" "+Width+" "+length;
    }
}
public class AbstractProgram7 
{ 
    public static void main(String[] args) 
    {
        System.out.println("----------circle-------");
        // creating object for circle class
        Circle1 c = new Circle1();
        // calling circle class methods with object
        c.setcolor("black");
        c.setfilled(true);
        c.setradius(1.0);
        System.out.println("The circle color :"+c.getcolor());
        System.out.println("The circle filled :"+c.isfilled());
        System.out.println("The circle radius :"+c.getradius());
        System.out.println("The circle area :"+c.getArea());
        System.out.println("The circle perimeter :"+c.getperimeter());
        System.out.println("The  object of circle is :"+c.toString());
        System.out.println("\n");
        System.out.println("----------Rectangle-------");
        // creating method for rectangle class
        Rectangle1 r = new Rectangle1();
        // calling method rectangle class methods with object
        r.setcolor("White");
        r.setfilled(true);
        r.setWidth(1.0);
        r.setlength(1.0);
        System.out.println("The Rectangle color :"+r.getcolor());
        System.out.println("The Rectangle filled :"+r.isfilled());
        System.out.println("The Rectangle radius :"+r.getWidth());
        System.out.println("The Rectangle radius :"+r.getlength());
        System.out.println("The Rectangle area :"+r.getArea());
        System.out.println("The Rectangle perimeter :"+c.getperimeter());
        System.out.println("The  object of Rectangle is :"+c.toString());
        System.out.println("\n");
        System.out.println("----------Square-------");
        // creating object for square
        Square s = new Square();
        // calling square class methods with object
        s.setcolor("pink");
        s.setfilled(true);
        s.setside(6);
        s.setWidth(9);
        s.setlength(5);
        System.out.println("The Square color :"+s.getcolor());
        System.out.println("The Square filled :"+s.isfilled());
        System.out.println("The Square radius :"+s.getside());
        System.out.println("The Square radius :"+s.getWidth());
        System.out.println("The Square area :"+s.getlength());
        System.out.println("The  object of Square is :"+c.toString());
        System.out.println("\n");
        
    }
    
}
