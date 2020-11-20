public class Rectangle7
 {
    int len;
    int breadth;

    Rectangle7(int l,int b)
    {
        len=l;
        breadth=b;
    }
    void area()
    {
        int area=1;
        System.out.println(area+"="+ len*breadth);
    }
    void perimeter()
    {
        System.out.println(2*(len+breadth));
    }
    public static void main(String[] args) 
    {
        Rectangle7 r=new Rectangle7(1,2);
        Rectangle7 r1=new Rectangle7(2, 5);
        r.area();
        r.perimeter();
        r1.area();
        r1.perimeter();
    }
 }
