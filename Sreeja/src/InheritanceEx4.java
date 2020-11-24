class Rectangle2
{
    int length;         //defining variables
    int breadth;

   public Rectangle2(int a,int b)       //two parameter constructor
   {
       length = a;                      
       breadth = b;
   }
   
   void area()          //method to print area
    {
        System.out.println("Area: "+" "+length*breadth);
    }

    void perimeter()        //method to print perimeter
    {
        System.out.println("Perimeter: "+" "+2*(length+breadth));
    }
}

class Square extends Rectangle2     
{
    int side;

   public Square(int s)         //single parameter constructor
   {
       super(s,s);
   }
}

public class InheritanceEx4 
{
     public static void main(String[] args) 
     {
        
        //creating objects with initializing constructors
        
        Rectangle2 rt = new Rectangle2(7,6);    //object creation for Rectangle class    
        Square sr = new Square(5);                  //object creation for square class
       
        rt.area();
        rt.perimeter();     //method calling to print results
        sr.area();
        sr.perimeter();
    }
}
