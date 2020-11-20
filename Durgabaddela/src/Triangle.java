public class Triangle
{
  int s1, s2, s3, z;
  public int Perimeter()
  {
      int perimeter = (s1+s2+s3)/2;
      perimeter = z;
      return z;
  }
  public int area()
  {
     int  area = Math.sqrt(z*(z-s1)*(z-s2)*(z-s3));
     return area;
  }
  public static void main(String[] args) 
  {
     Triangle t = new Triangle();
     t.s1 = 3;
     t.s2 = 4;
     t.s3 = 5;
     System.out.println(t.z + " "+ t.area());


  }  
}
