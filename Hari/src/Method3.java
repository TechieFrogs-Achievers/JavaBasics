public class Method3 
{
    // Method to print area of Rectangle
    static int rectArea( int len , int bre )
    {
        int Rectarea = len  * bre ;
        return Rectarea ; 
    }
    // Method to print area of Square
    static int sqrArea( int side )
    {
        int Squarearea = side * side ;
        return Squarearea ;
    }
    public static void main (String[] args)
    {
        int Area1 = rectArea(5,3);
        int Area2 = sqrArea(4);
        System.out.println(Area1);
        System.out.println(Area2);
    }
}
