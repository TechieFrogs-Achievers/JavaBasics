class Triangle 
{
    float side1 , side2 , side3 , perimeter ;
    double area ;
    public Triangle ( float side1 , float side2 , float side3 )
    {
        if ( (side1 + side2) > side3 && (side2 + side3) > side1 && (side1 + side3) > side2)
        {
            float s = (side1 + side2 + side3) / 2 ;
            area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
            perimeter = side1 + side2 + side3 ;
            System.out.println("Area of Triangle = " + area + " Perimeter of Triangle = " + perimeter);
        }
    } 
}
public class OC4
{
    public static void main(String []args)
    {
        Triangle tr = new Triangle( 3 , 4 , 5 );
    }
}
