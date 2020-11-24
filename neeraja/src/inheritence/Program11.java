package inheritence;


class Circlee
{
    double radius;
    String colour;
    Circlee()
    {
      this.radius =1.0;
      this.colour="red";
    }
    Circlee(double radius)
    {
      this.radius=radius;
    }
    Circlee(double radius,String colour)
    {
        this.radius =radius;
      this.colour=colour;
    }
   
    
    double getArea()
    {
      double  area=(22/7)*(Math.pow(radius,2));
      return area;
    }

}

class Cylinder extends Circlee
{
    double height;

    Cylinder()
    {

    }
    Cylinder(double radius)
    {

    }
    Cylinder(double radius,double height)
    {

    }
    Cylinder(double radius,double height,String colour)
    {

    }
   
    public double getVolume()
    {
       return getArea() * height;
    } 

}


public class Program11 
{
    public static void main(String[] tf)
    {
       

    }
    
}
