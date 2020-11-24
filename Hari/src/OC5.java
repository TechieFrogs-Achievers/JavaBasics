class Rectangle 
{
    float area , length , breadth ;
    public Rectangle ( float length , float breadth )
    {
        System.out.println( "Length of Rectangle  = " + length + " Breadth of Rectangle  = " + breadth );
    }
    float rectArea( float a , float b )
    {
        area = a * b ;
        return area ;
    }
}
public class OC5 
{
    public static void main(String[] args)
    {
        Rectangle rectangle1 = new Rectangle ( 5 , 4 );
        Rectangle rectangle2 = new Rectangle ( 8 , 5 ) ;
        float area1 = rectangle1.rectArea( 5 , 4 );
        float area2 = rectangle2.rectArea( 8 , 5 );
        System.out.println(area1);
        System.out.println(area2);
    }
}
