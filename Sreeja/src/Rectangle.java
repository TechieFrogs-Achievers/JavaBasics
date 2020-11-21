public class Rectangle 
{
    int length;
    int breadth;

    Rectangle(int a,int b)
    {
        length = a;
        breadth = b;
    }

     void area()
    {
        int area = length*breadth;
        System.out.println(area);
    }
     public static void main(String[] args)
      {
          Rectangle rec = new Rectangle(4,5);
        Rectangle rec1 = new Rectangle(5,8);
        rec.area();
        rec1.area();
    }
}
