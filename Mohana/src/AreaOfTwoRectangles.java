public class AreaOfTwoRectangles 
{
    int length ;
    int breadth; 
    public AreaOfTwoRectangles( int l , int b)
    {
        length = l;
        breadth = b;
    }
    public double area()
    {  
        double rectanglearea = length*breadth;
         return rectanglearea;
    } 
    public double perimeter()
    {
        double p = 2*(length*breadth);
        return p ;
    } 
     public static void main(String[] args) 
     { 
         AreaOfTwoRectangles rect1 = new AreaOfTwoRectangles(4,5);
         AreaOfTwoRectangles  rect2 = new AreaOfTwoRectangles(5, 8);
         System.out.println( " area of 1st  rectangle = " +rect1.area()+ " --"+ " perimeter of 1st tringle = "+ rect1.perimeter());
         System.out.println( " area of 1st  rectangle = " +rect2.area()+ " --"+ " perimeter of 1st tringle = "+ rect2.perimeter());
    
     }
    
}
