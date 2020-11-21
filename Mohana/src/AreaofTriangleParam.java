public class AreaofTriangleParam 
{
    int side1 ,side2,side3;
    AreaofTriangleParam( int a , int b ,int c )//constructor having parameters parameters
    {
        side1= a;
        side2 =b;
        side3 = c;
    } 
    public void  area()//method to calculate area
    { 
        double s = (side1+side2+side3)/2;
        double area = Math.sqrt( s*(s-side1)*(s-side2)*(s-side3));
        System.out.println(area);

    } 
    public void perimeter()//method to calculate perimeter
    {
        double perimeter = (side1+side2+side3);
        System.out.println(perimeter);
    } 
    public static void main(String[] args) 
    {
      AreaofTriangleParam ae = new AreaofTriangleParam(3, 4, 5);
        ae.area();
        ae.perimeter();      
    }
    
}
 
    
