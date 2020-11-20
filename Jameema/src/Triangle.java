public class Triangle 
{
    int a=3,b=4,c=5;
    public void Area()
    {
        double s=(a+b+c)/2;
        double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("the area of triangel" +area);
    }
    public void Perimeter()
    {
        double perimeter=(a+b+c);
        System.out.println("the perimeter of triangle" +perimeter);
    }
    public static void main(String[] args)
     {
         Triangle t= new Triangle();
         t.Area();
         t.Perimeter();
        
    }
    
}
