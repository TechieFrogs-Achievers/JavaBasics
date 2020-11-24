package inheritence;

class Circlle 
 {          
   // private instance variable, not accessible from outside this class
   private double radius;
   private String color;
   
   // 1st constructor, which sets both radius and color to default
   public Circlle() {
      radius = 1.0;
      color = "red";
   }
   
   // 2nd constructor with given radius, but color default
   public Circlle(double r) {
      radius = r;
      color = "red";
   }
   
   // A public method for retrieving the radius
   public double getRadius() {
     return radius; 
   }
   
   // A public method for computing the area of circle
   public double getArea() {
      return radius*radius*Math.PI;
   }
}
class Cylinderr extends Circlle 
{  
   private double height;  // private variable
   
   // Constructor with default color, radius and height
   public Cylinderr() {
      super();        // call superclass no-arg constructor Circle()
      height = 1.0; 
   }
   // Constructor with default radius, color but given height
   public Cylinderr(double height) {
      super();        // call superclass no-arg constructor Circle()
      this.height = height;
   }
   // Constructor with default color, but given radius, height
   public Cylinderr(double radius, double height) {
      super(radius);  // call superclass constructor Circle(r)
      this.height = height;
   }
   
   // A public method for retrieving the height
   public double getHeight() {
      return height; 
   }
  
   // A public method for computing the volume of cylinder
   //  use superclass method getArea() to get the base area
   public double getVolume() {
      return getArea()*height; 
   }
}








public class TestCase
 {
    public static void main (String[] args) {
        // Declare and allocate a new instance of cylinder
        //   with default color, radius, and height
        Cylinderr c1 = new Cylinderr();
        System.out.println("Cylinder:"
              + " radius=" + c1.getRadius()
              + " height=" + c1.getHeight()
              + " base area=" + c1.getArea()
              + " volume=" + c1.getVolume());
     
        // Declare and allocate a new instance of cylinder
        //   specifying height, with default color and radius
        Cylinderr c2 = new Cylinderr(10.0);
        System.out.println("Cylinder:"
              + " radius=" + c2.getRadius()
              + " height=" + c2.getHeight()
              + " base area=" + c2.getArea()
              + " volume=" + c2.getVolume());
     
        // Declare and allocate a new instance of cylinder
        //   specifying radius and height, with default color
        Cylinderr c3 = new Cylinderr(2.0, 10.0);
        System.out.println("Cylinder:"
              + " radius=" + c3.getRadius()
              + " height=" + c3.getHeight()
              + " base area=" + c3.getArea()
              + " volume=" + c3.getVolume());
     }
    
}
