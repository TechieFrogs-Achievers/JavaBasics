abstract class Shapess
{   
    
    protected  String color;
    protected boolean filled;
    Shapess() //Abstract method
    {

    }
    Shapess(String c, boolean f)//method with parameter
    {  
         color = c;
         filled = f;

    }
     public String getcolor()//method
    {
        return color;
    }
    
     public void setcolor(String c )//methode
    {
        color = c;

    }
      public boolean  isfilled()//methode
    { 
        return filled;   
    }
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
class Circle1 extends Shapess //class 1
{
     protected double radius;
    Circle1()
    {

    }
    Circle1(double r)//constructor with parameter
    {
        radius = r;
    }
    Circle1(double r, String c , boolean f )
    {
        super(c , f);
        radius = r;

    }
    public double getradius()
    {
        return radius;
    }
    public void setradius( double r)
    {
        radius = r;
    } 
     public  double getArea()
     {
         return 3.14*radius*radius;
     }
     public double getperimeter()
     {
         return 2*3.14*radius;
     }

}

class Rectangle1 extends Shapess //subclass 2
{
     protected double Width;
     protected double length;
    Rectangle1(String c, boolean f)
    {

    }
    Rectangle1(double w, double l)//constructor with parameter
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
    public double getWidth()
    {
        return Width;
    }
    public void setWidth( double w)
    {
        Width = w;
    }
    public double getlength()
    {
        return length;
    }
    public void setlength( double l)
    {
        length = l;
    } 
     double getArea()
     {
         return  (length*Width);
     }
     double getperimeter()
     {
         return 2*(length*Width);
     }
      public String toString()
     {
         return  color+" "+filled+" "+Width+" "+length;

     }
}
 class Square extends  Rectangle1 // sub class for rectangle

{   
     protected double side;
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
        super(c , f);
        side = s;
    }
    public double getside()
    {
        return side;
    }
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
    public String toString() 
    {
        return color+" "+filled+" "+Width+" "+length;
    }
}
public class Abstract7 
{ 
    public static void main(String[] args) 
    {
        System.out.println("circle");// creating object for circle class
        Circle1 c = new Circle1();
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
        System.out.println("Rectangle");// creating method for rectangle class
        Rectangle1 r = new Rectangle1();
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
        System.out.println("Square");// creating object for square
        Square s = new Square();
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

