class Rectangle
{
    int length;
    int  breadth;
    //create parameteraized constructor
    Rectangle(int l,int b)
    {
        length=l;
        breadth=b;
    }
    //find area od Rectangle
    public void area()
    {
        int area = (length*breadth);
        System.out.println("Area of Rectangle:"+area);
    }
    //perimeter of Rectangle
    public void perimeter()
    {
        int perimeter=2*(length+breadth);
        System.out.println("perimeter of Rectangle:"+perimeter);
    }
}

public class RectangleProgram 
{
  public static void main(String[] args) 
  {
      Rectangle r=new Rectangle(4,5);//assign values
      Rectangle r1=new Rectangle(5,8); //assign values 
      r.area();//method calling
      r.perimeter();//method calling
      r1.area();//method calling
      r1.perimeter();//method calling

  }  
}
