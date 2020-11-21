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
        return Area = length*breadth;

    }
    public int Perimeter ()
    {
        return  2* (length+ breadth);

    }
    public static void main(String[] args)
    {
        Rectangle r1 = new Rectangle(4,5);
        Rectangle r2 = new Rectangle(5,8);
        System.out.println(r1.Area());
        System.out.println(r1.Perimeter());
        System.out.println(r2.Area());
        System.out.println(r2. Perimeter());
        
        
        
    }
    
}
