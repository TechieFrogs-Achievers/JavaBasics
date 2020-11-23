public class Area3 {
    int length, breadth,side,area;
    public  int squareAndRectangle(int l,int b)
    {
       int length=l;
       int  breadth=b;
       area=l*b;
       return area;
    }
    public  int squareAndRectangle(int s)
    {
       int side = s;
       area= s*s;
       return area;
    }
    public static void main(String args[]) {
    Area3 a3= new Area3();
   System.out.println( a3.squareAndRectangle(5,4));
   System.out.println( a3.squareAndRectangle(5));


    }

}
