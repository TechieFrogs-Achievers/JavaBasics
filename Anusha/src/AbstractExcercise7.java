
public class AbstractExcercise7 
{
    public static void main(String[] args) 
    {
        CricleClass c=new CricleClass();
        c.getArea(5);
        c.getParimeter(5);
        RectangleClass r1= new RectangleClass();
        r1.getArea(5);
        r1.getParimeter(6);
        SquareClass sc=new SquareClass();
        sc.setLeng(5.25d);
        sc.setWeadth(5.5d);
    }
}
abstract class ShapeClass
{
    //data members 
      protected String color="red";
     protected boolean filled=true;
      ShapeClass()//constructoe
      {

      }
      ShapeClass(String c,boolean v)//parameterized constructor
      {
          color=c;v=filled;
      }
      public String getColor()//getter method
      {
          return color;
      }
      public void setColor(String color)//setter method 
      {
          this.color = color;
      }
      public boolean isFilled() //isfilled method
      {
          return filled;
      }
      public void setFilled(boolean filled) //setter method
      {
          this.filled = filled;
      }
      abstract void getArea(double d);//abstract method for area
      abstract void getParimeter(double d);//abstract method for parameter
      
    }



    class CricleClass extends ShapeClass
    {
        double radious=1.0;
        CricleClass()
        {

        }
        CricleClass(double r)
        {
            radious=r;
        }
        CricleClass(double r,String c,boolean f)
        {
            radious=r;color=c;filled=f;
        }
        public double getRadious() 
        {
            return radious;
        }  
        public void setRadious(double radious) 
        {
            this.radious = radious;
        }
        void getArea(double d) 
        {
            double area=(3.14)*radious*radious;
            System.out.println("area of circle="+area);
        } 
       void getParimeter(double d)
       {
        double area=(3.14)*radious*radious;
          double perimeter=(double)Math.sqrt(4*3.14*area);
          System.out.println("perimeter of a circle"+perimeter);
       }
       
        
    }


    class RectangleClass extends ShapeClass
    {
        double length=1.0;
        double weadth=1.0;
        RectangleClass()
        {
        }
        RectangleClass(double l,double b)
        {
            length=l;weadth=b;
        }
        RectangleClass(double l,double b,String c,boolean f)
        {
            length=l;weadth=b;color=c;filled=f;  
        }
        public double getWidth() 
        {
            return weadth;
        }
        public void setWidth(double weadth) 
        {
            this.weadth = weadth;
        }
        public double getLength() 
        {
            return length;
        }
        public void setLength(double length) 
        {
            this.length = length;
        }
        void getArea(double d)
        {
            double area=length*weadth;
       System.out.println("Area of a Rectangle  is="+area);
        }
        void getParimeter(double d)
        {
            double perimeter=(length*weadth)*2;
            System.out.println("perimeter of rectangle:"+perimeter);
        }
    }


    class SquareClass extends RectangleClass
    {
        double side;
        SquareClass()
        {

        }
        SquareClass(double d)
        {
         side=d; 
        }
        SquareClass(double d,String c,boolean f)
        {
            side=d;color=c;filled=f;
        }
        public double getSide() 
        {
            return side;
        }
        public void setSide(double side) 
        {
            this.side = side;
        }
        void setWeadth(double d)
        {
           System.out.println( this.side = weadth);
        }
        void setLeng(double s)
        {
            System.out.println( this.side = length); 
        }
    }