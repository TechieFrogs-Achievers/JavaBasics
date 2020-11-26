public class Rectangle1 
{
    int length,breadth;
   void Rectangle(int length,int breadth)

   {
      length=2;
       breadth=3;
   }


// area og rectangle
void area()
{
    int area = (length*breadth);
    System.out.println("Area:"+area);
}
 //perimeter of Rectangle
 public void perimeter()
 {
     int perimeter=2*(length+breadth);
     System.out.println("perimeter :"+perimeter);
 }
}
 // rectangle class
class Square extends Rectangle1
{
    int side;
    Square(int s)
    {
       Super(s.s);
    }


public static void main(String[] args) 
{
    Rectangle1 r=new Rectangle1();// creating object
        System.out.println("Rectangle");
        r.area();//method calling
        r.perimeter();//method calling
        Square s1=new Square(4);// creating object
        System.out.println("Square");
        s1.area();//method 
        s1.perimeter();//method
}
}