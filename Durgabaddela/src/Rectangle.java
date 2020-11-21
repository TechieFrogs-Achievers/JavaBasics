public class Rectangle {
    int length;
    int breadth;

    public Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    public int Area() {
        int Area = length * breadth;
        return Area;
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(4, 5);
        int areaOfRectangle1 = r.Area();
        Rectangle rt = new Rectangle(5, 8);
      int areaOfRectangle2  = rt.Area();
      System.out.println("area of Rectangle1 = " + areaOfRectangle1);
      System.out.println("area of Rectangle2 = " + areaOfRectangle2);

  }
}
