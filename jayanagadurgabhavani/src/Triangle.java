public class Triangle 
{
    int side1=3,side2=4,side3=5;
    Triangle()
    {
        
        int a=side1;
        int b=side2;
        int  c=side3;
    }

    void TriangleareaDisplay()
    {
        double s=(side1 + side2 + side3)/2;
        double area=Math.sqrt(s * (s- side1) * (s- side2) * (s- side3));
        System.out.println(" triangle area: " +area);

    }
    void perimeterDisplay()
    {
        int perimeter= (side1 + side2 + side3 );
        System.out.println(" perimeter is:" +perimeter);
    }
    public static void main(String[] args)
    {
        Triangle T= new Triangle();
        T.TriangleareaDisplay();
        T.perimeterDisplay();    
    }


}
