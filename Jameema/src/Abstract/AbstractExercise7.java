package Abstract;
abstract class Shape2 //abstract class
{
    protected String color;
    protected boolean filled; //protected data member
    
    public Shape2() //default constractor
    {

    }

    public Shape2(String c, boolean f) //parameterised constructor
    {
        color=c;
        filled=f; //assigning variable to parameter
    }
    public String getColor() //accessor method
    {
        return color;
    }
    public void setColor(String c) //mutator metod
    {
        color=c;
    }
    public boolean isFilled() //accessor method
    {
        return filled;
    }
    public void setFilled(boolean f)
    {
        filled=f;
    }
    abstract double getArea(); //abstract method
    abstract double getPerimeter();
    public String toString() //string metgod
    {
        return color+" "+filled;
    }

}
//inherits abstract class details
class Circle2 extends Shape2
{
    protected double radius; //protected data member
    public Circle2()
    {

    }
    public Circle2(double r) //parameterised constructor
    {
        radius=r;
    }
    public Circle2(double r,String c,boolean f)
    {
        super(c,f);
        radius=r;
    }
    public double getRadius() //accessor method
    {
        return radius; //return the radius
    }
    public void setRadius(double r)
    {
        radius=r;
    }
    public double getArea()
    {
        return Math.PI*radius*radius; //return the area of circle
    }
    public double getPerimeter()
    {
        return 2*Math.PI*radius; //return the perimeter of circle
    }
    public String toString()
    {
        return color+ " "+ filled+" "+radius;
    }
} 
//inherits the abstract class details 
class Rectangle2 extends Shape2
{
    protected double width;
    protected double length; //protected datamember
    public Rectangle2() 
    {

    }

    public Rectangle2(String c, boolean f)
    {

    }
    public Rectangle2(double w, double l)
    {
        width=w;
        length=l;
    }
    public Rectangle2(double w,double l, String c,boolean f) //parameterised constructor
    {
        super(c,f);
        width=w;
        length=l;
    }

    public double getWidth() //accessor method
    {
        return width;
    }
    public void setWidth(double w) //mutator method
    {
        width=w;

    }
    public double getLength()
    {
        return length; //return the length
    }
    public void setLength(double l)
    {
        length=l;

    }
    public double getArea() 
    {
        return (length*width); //return the area of rectangle
    }
    public double getPerimeter()
    {
        return 2*(length+width); //return the perimeter of rectangle
    }
    public String toString()
    {
        return color+ " "+filled+" "+width+" "+length;
    }
}
//inherits the Rectangle class details
class Square2 extends Rectangle2
{
    protected double side; //protected data member
    public Square2()
    {

    }
    public Square2(double s)
    {
        
        side=s;
    }
    public Square2(double s,String c,boolean f)
    {
        super(c,f); //it  calls the parent class constructor
        side=s;
    }
    public double getSide()
    {
        return side; //return the side of square
    }
    public void setSide(double s) //mutator method
    {
        side=s;
    }
    public void setWidth(double w)
    {
        width=w; //assign the parameter to variable
    }
    public void setLength(double l)
    {
        length=l;
    }
    public String toString() //string method
    {
        return color+" "+filled+" "+width+" "+length;
    }
}

public class AbstractExercise7
 {
     public static void main(String[] args)
      {
          System.out.println("---circle-----");
          Circle2 cirobj = new Circle2(); //creating object 
          cirobj.setColor("red"); //calling mutator method by using object
          cirobj.setFilled(true);
          cirobj.setRadius(1.0);
          System.out.println("the circle color :" +cirobj.getColor()); //printing thecolor of circle
          System.out.println("the circle filled :" +cirobj.isFilled());
          System.out.println("the circle radius :" +cirobj.getRadius()); //calling accessor by using object
          System.out.println("the circle area :" +cirobj.getArea());
          System.out.println("the circle perimeter :" +cirobj.getPerimeter());
          System.out.println("the objects of circle  :"+cirobj.toString()); //prints the objects of circle
          System.out.println("\n");
          System.out.println("---Rectangle----");
          Rectangle2 recobj = new Rectangle2();  //calling mutator method by using object
          recobj.setColor("green");
          recobj.setFilled(true);
          recobj.setWidth(1.0);//calling mutator method by using object
          recobj.setLength(1.0);
          System.out.println("the rectangle color :" +recobj.getColor());
          System.out.println("the rectangle filled :" +recobj.isFilled());
          System.out.println("the rectangle width :" +recobj.getWidth());
          System.out.println("the rectangle length :" +recobj.getLength()); //calling accessor by using object
          System.out.println("the rectangle area :" +recobj.getArea());
          System.out.println("the rectangle perimeter :" +recobj.getPerimeter());
          System.out.println("the objects of Rectangle  :"+recobj.toString()); //prints the objects of circle
          System.out.println("\n");
          System.out.println("-----Square-----");
          Square2 sqrobj = new Square2();//calling mutator method by using object
          sqrobj.setColor("blue");
          sqrobj.setFilled(false);
          sqrobj.setSide(4);//calling mutator method by using object
          sqrobj.setWidth(6);
          sqrobj.setLength(5);
          System.out.println("the Square color :" +sqrobj.getColor()); //calling accessor by using object
          System.out.println("the Square filled :" +sqrobj.isFilled());
          System.out.println("the Square side :" +sqrobj.getSide()); //prints the square of side
          System.out.println("the Square width :" +sqrobj.getWidth());
          System.out.println("the Square length :" +sqrobj.getLength());
          System.out.println("the objects of square  :"+sqrobj.toString()); //prints the objects of circle

     }
    
}
