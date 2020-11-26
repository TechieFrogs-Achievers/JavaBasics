class Rectangle {
    int length,breadth;
    Rectangle (int l,int b)
     {
      // int length =l;
       //int breadth= b;

    }
    public int displayarea(int l,int b )
    {
        int area;
         area=length *breadth;
         return area;

    }
    public int displayperimeter(int perimeter)
    {
        perimeter=2*(length+breadth);
        return perimeter;
    }
}

class Square extends Rectangle
{
int side;
   Square (int s)
    {
  //  s =s*s;
    super(s,s);
    }


}

public class Rectangle1
{
    public static void main(String args[]) {
        Rectangle1 r= new Rectangle1();
        r.displayarea();
        r.displayperimeter();
 


    }


}
