import org.graalvm.compiler.core.common.type.ArithmeticOpTable.UnaryOp.Sqrt;

class Triangle
{ 
    int a,b,c;
    //assign values in constructor
    Triangle()
    {
        a=3;
        b=4;
        c=5;
    }
    //method for area of triangle
    public double area()
    {
      double s=(a+b+c)/2;
      return (double)Math.sqrt(s*(s-a)*(s-b)*(s-c)); 
    }
    //method for perimeter of triangle
    public double perimeter()
    {
       double s=(a+b+c);
       return s;
    }
}
public class Test
{
    public static void main(String[] args) 
    {
      
    Triangle t =new Triangle(); //object creation 
     
     System.out.println(" Area of Traingle:"+t.area());
     System.out.println(" Perimeter of Traingle:"+t.perimeter());
   }
}