package InheritenceExcercises;
// Rectangle as a parent class

class Rectangle
{
    //declaring the data members

 int length, breadth;

  //method to display Area

  public void AreaDisplay()
  {
      int Area = length * breadth;
      System.out.println("Area = "+ Area);
  }

  //method to display perimeter

  public void Perimeter()
  {
      int Perimeter = 2*(length+breadth);
      System.out.println("perimeter = "+  Perimeter);
  } 
  //consturctor for rectangle parameters initilize 

  public Rectangle(int l, int b)
  {
      length = l;
      breadth = b;
  }
}
//square class inherites the parent class

  class Square extends  Rectangle
  {   
      int side; 
      //constructor  

      public Square(int s)
      {
          super(s,s);//calling parent class constructor
      }
  }

public class Inheritence4
{
    public static void main(String[] args)
     {  
         // creating an object for rectangle

        Rectangle r = new Rectangle(2,3);
        r.AreaDisplay();//method call
        r.Perimeter();

        // creating an object for rectangle

        Square s = new Square(9);
        s.AreaDisplay();//method call
        s.Perimeter();
     }

}
