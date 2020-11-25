package InheritanceDoc;
 
class Rectangle //parent class
{
    int length;
    int breadth;
 public Rectangle(int l,int b)//constructor having two parameters
  {
     length = l;
     breadth = b;
  } 

  public void area() //method to display area
  {
      System.out.println( " area is " +length*breadth);
  } 
  public void perimeter()//method to display perimeter 
  {
      System.out.println( "Perimeter is " +2*(length+breadth));
  }  
}
  class Square extends Rectangle //inheriting properties of rectangle
  {
      int side;
      public Square( int s)//one parameter constructor for child class
      {
          super(s, s); //calling parent class constructor using super 
      }
  }

public class Program4 
{
  public static void main(String[] args) 
   {
      Square sq = new Square(2); //object for child class

      Rectangle re = new Rectangle(2, 5);//object for super class

      System.out.println( "-----Rectangle-----");
      re.area();
      re.perimeter();
      System.out.println("-----SQUARE-----");
      sq.area();
      sq.perimeter();   
      
   }
    
}
