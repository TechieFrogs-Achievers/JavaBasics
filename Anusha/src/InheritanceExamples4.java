public class InheritanceExamples4 
{
    public static void main(String[] args) 
    {
        RectangleX r=new RectangleX(4, 5);//assign values by creating object
        System.out.println("-----Rectangle-----");
        r.area();//method calling
        r.perimeter();//method calling
        SquareX s1=new SquareX(4);//assign values by creating object
        System.out.println("-----Square-----");
        s1.area();//method calling by using child class object
        s1.perimeter();//method calling by using child class object
    }
}
class RectangleX
{
    int length,breadth;
    //constructor for initialize length and breadth of the rectangle
    RectangleX(int l,int b)
    {
       length=l;
       breadth=b;
    }
        //find area od Rectangle
        public void area()
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
//child class of the rectanglex class
class SquareX extends RectangleX
{
    int side;
    SquareX(int s)
    {
       super(s,s);
    }
}
