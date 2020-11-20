public class Triangle 
{
    //initializing sides of triangle
    int firstSide=3;
    int secondSide=4;
    int thirdSide=5;
    
    //method to calculate perimeter of triangle
    public int perimeter()
    {
        int perimeter=firstSide+secondSide+thirdSide;
        return perimeter;
    }

    // method to claculate area of tringle
    public double area()
    {
        int s=(firstSide+secondSide+thirdSide)/2;
        double areaOfTriangle=Math.sqrt(s*(s-firstSide)*(s-secondSide)*(s-thirdSide));
        return  areaOfTriangle;
    }
    

    public static void main(String[] yh)
    {
        //object for the class triangle
        Triangle triobj=new Triangle();

        // method calls
        int p=triobj.perimeter();
        double a=triobj.area();

        // printing output
        System.out.println("perimeter of triangle is: "+ p);
        System.out.println("area of triangle is     : "+ a);


    }
    
}
