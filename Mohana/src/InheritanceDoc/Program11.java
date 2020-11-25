
package InheritanceDoc;

class Circle1 //parent class
{
     double radius ;
     String colour;

 public Circle1() //no parameter constructor
 { 
       radius = 1.0;
       colour = "red";
 }
 
 public Circle1(double radius) //single parametrized constructor
 {
    this.radius = radius;
 }
 //  constructor having two parameters 
 public Circle1(double radius , String colour) 
 {
    this. radius = radius;
    this. colour = colour;
 }
 
 //  method for retrieving the radius
 public double getRadius(double radius) 
 {
   return this.radius;
 } 
 public String getColour(String colour)//method to retrive colour
 {
    return this.colour ;
 }
 public double getArea() //method to calculate area 
 {
    return (radius*radius*Math.PI);
 }
}
class Cylinder extends Circle1
{
   double height;

   public Cylinder()//no param constructor
   {
      super();
      this.height = 1.0;
   }
   public Cylinder(double height)//single param constructor
   {
      super(); //call parent constructor
      this.height = height;
   } 

   public Cylinder(double height,double radius)//2 param construcror
   {
      super(radius);
      this.height = height;
   }  

   public Cylinder(double height,double radius,String colour)// 3 para, constructor
   {
      super(radius,colour);
      this.height = height;
   } 

   public double getHeight() // method to get area 
   {
         return this.height;
   }
}

    public class Program11 
   {
     public static void main(String[] args) 
     {
        Cylinder c1 = new Cylinder(); //object creation
        System.out.println("The height of cylinder is : " +c1.getHeight());  
        System.out.println(" The colour of Cylinder is : " + c1.getColour("red"));
        System.out.println("the Area of cylinder is :" +c1.getArea());  


        System.out.println( " parametrized constructor cylinder values ");
         

          Cylinder c2 = new Cylinder(2.5,5.5,"red"); //object creation
          System.out.println("The height of cylinder is : " +c2.getHeight());  
        System.out.println(" The colour of Cylinder is : " + c2.getColour("red"));
        System.out.println("the Area of cylinder is :" +c2.getArea()); 

        
     }
 }


















