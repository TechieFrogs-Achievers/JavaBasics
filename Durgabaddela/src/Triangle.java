public class Triangle
{
   //initilize the sides of a triangle

  int s1 = 3;
  int s2 = 4;
  int s3 = 5;
  public int Perimeter()
  {
      int Perimeter = (s1+s2+s3)/2;
      return Perimeter;
  }
  public double area()
  { double s = (s1+s2+s3)/2;
     double  area = Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
     return area;
  }
  public static void main(String[] args) 
  {
     Triangle t = new Triangle();
     System.out.println(t.Perimeter()+" " +t.area());
     


  }  
}
