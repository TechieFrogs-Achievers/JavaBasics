public class TriangleWithConstructor {
    int side1;
    int side2;
    int side3;
     //creating constructor

    public TriangleWithConstructor(int s1, int s2, int s3)
   {
       side1 = s1;
       side2 = s2;
       side3 = s3; 
   }
   public int Perimeter()
   {
       int Perimeter = (side1+side2+side3)/2;
       return Perimeter;
   }
   public double area()
   {
       double s = (side1+side2+side3)/2;
       double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
       return area; 
   }
   public static void main(String[] args)
   {
       TriangleWithConstructor tc = new TriangleWithConstructor(3, 4, 5);
       System.out.println("Perimeter = " + tc.Perimeter());
       System.out.println("area      = " + tc.area());

   }

}
