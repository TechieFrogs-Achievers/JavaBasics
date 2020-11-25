class Shape {
    public void shape()
    {
        System.out.println("This is shape");
    }
    
}
class Rectangle2 extends Shape
{
  public void rectangle()
  {
      System.out.println("This is a rectangle shape");
  }
  

}
class Circle extends Shape 
{
    System.out.println("This is a circle shape");

    

}
class SquareOfRectangle
  {
        public void rectangle()
      {
          System.out.println("Square is a rectangle ");
      }
  }
public class Shape1
{
    public static void main(String args[])
     {
       SquareOfRectangle s=new SquareOfRectangle();
       //Shape1 s= new Shape1();        
        s.shape();
        s.rectangle(); 
    }

}

