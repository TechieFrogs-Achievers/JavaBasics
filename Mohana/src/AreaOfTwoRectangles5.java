public class AreaOfTwoRectangles5 
{
    int length ,breadth;
    AreaOfTwoRectangles5(int l,int b)//parametrized construcyor
    { 
        length = l;
        breadth = b;

    } 
    public void calulateArea()//method to calculate area
    {
        System.out.println( " area of rectangle is = " +length*breadth);
    } 

    public static void main(String[] args) 
    {
        AreaOfTwoRectangles5 ae1 = new AreaOfTwoRectangles5(4, 5);
        AreaOfTwoRectangles5 ae2 = new AreaOfTwoRectangles5(5, 8);
        ae1.calulateArea();
        ae2.calulateArea();
        
    }
    
}
