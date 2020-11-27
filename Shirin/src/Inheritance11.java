//super class
class Circles 
{
    private double radius;
    private  String colour;
    // default constructor
    Circles()
    {

    }
    //constructor for radius
    Circles(double r)
    {
        radius = r;

    }
    // constructor for radius &colour
    Circles(double r , String c)
    {
        radius = r;
        colour = c;

    }
    //Accesor method
     public double getRadius() 
    {
        return radius;
    }
    //mutator method
    public void setradius(double r)
      {
          radius = r;
         
      }
      // Accesor method for return 
    String getColour()
    {
        return colour;
    }
    void setcolour(String c)
    {
        colour = c;
    }
     double getarea()
     {
         return  radius*radius*3.14;

     }
}
     // sub class
class Cylinder extends Circles
   {    
       private double height;
       // default constructor 
       Cylinder()
       {

       }
       //constructor for radius and height
       Cylinder(double r, double h)
       {
           super(r);
           height = h;
       }
       // constructor for radius ,height , colour
       Cylinder (double r, double h , String c)
       {
           super(r ,c);
           height = h;
       }
       public  double getheight()
       {
           return height;
       }
        void setheight(double h)
       {
           height = h;
       }
       public  double getvolume()
       {
           return getarea()*height;
       }
       public double getarea()
       {
            double Surfacearea=(2*3.14*getRadius()*height)+(2*3.14*getRadius()*getRadius());
            return Surfacearea;

       }
    }
 public  class Inheritance11
 {
     public static void main(String[] args)
    {           
                //creating object for circles
                Circles c = new Circles();
                // calling methods with object for circle
                System.out.println("---------circles-------");
                c.setradius(3.0);
                System.out.println("Radius is :" +c.getRadius());// print radius
                c.setcolour("black");
                System.out.println("colour of circle is :" +c.getColour());//print colour
                System.out.println("Area of circle is : "+c.getarea());//print area 
                System.out.println(" ");
                
                System.out.println("--------cylinder---------");
                // creating object for cylinder
                Cylinder c1 = new Cylinder();
                // calling circle methods with object
                c1.setradius(2.0);
                System.out.println("Radius of cylinder is :" +c1.getRadius());
                c1.setheight(1.0);
                System.out.println("height of cylinder is :" +c1.getheight());
                c1.setcolour("wheight");
                System.out.println("colour of cylinder is :" +c1.getColour());
                System.out.println("surfacearea of cylinder is : " +c1.getarea());
                System.out.println("volume of cylinder is :" +c1.getvolume());

         
    }
 }          

