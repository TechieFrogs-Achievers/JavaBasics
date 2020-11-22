public class Rectangle
 {
     int a,b;
     Rectangle(int length , int breadth)
     {
         a=length;;
         b=breadth;
     }
    public int Area()
    {
        int c=a*b;
         return c;
    }
    public static void main(String[] args)
     {
         Rectangle r = new Rectangle(4,5);
         Rectangle r1 = new Rectangle(5,8);
         System.out.println(" The area of Rectangele " + r.Area());
         System.out.println(" the area of rectangle "+ r1.Area());
        
    }

}
