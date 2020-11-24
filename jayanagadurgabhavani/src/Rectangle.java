public class Rectangle 
{
    int length;
    int breadth;
    int Area;
    int Perimeter;

    Rectangle ( int l , int  b)
    {
        length = l;
        breadth = b;

    }
     public int Area()
    {
        // area farmula lenght*breadth
        return Area = length*breadth;

    }
    public int Perimeter ()
    {
        //perimeter farmla2*(l+b)
        return  2* (length+ breadth);

    }
    public static void main(String[] args)
    {
        Rectangle r = new Rectangle(4,5);
        System.out.println(" rectangle r area:" +r.Area());
        System.out.println(" rectangle r perimeter:" + r.Perimeter());
        Rectangle r1 = new Rectangle(5,8);
        System.out.println(" rectangle r1 area:" + r1.Area());
        System.out.println(" rectangle r1 perimeter:" + r1. Perimeter());
    }
}
