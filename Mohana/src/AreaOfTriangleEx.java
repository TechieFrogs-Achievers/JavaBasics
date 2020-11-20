public class AreaOfTriangleEx 
{
    int sidea = 3;
    int sideb = 4 ;
    int sidec = 5;
    double s ;
    void perimeter()
    {
        int s = ( sidea+ sideb+ sidec)/2;
        System.out.println( "perimeter of Triangle is = " +s);
    }  
      void triangleArea() 
      {
         double  area = Math.sqrt ( s*(s-sidea)* (s- sideb)*(s- sidec ));
        System.out.println( "Area of triangle is = "+ area);
      }
    
    public static void main(String[] args) 
    {
        AreaOfTriangleEx ex = new AreaOfTriangleEx();
        ex.perimeter();
         ex.triangleArea();
        
        
    }
    
}
