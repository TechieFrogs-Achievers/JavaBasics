public class TriangleWithConstructor
 {
     //declaration of sides of triangle
    int firstSide;
    int secondSide;
    int thirdSide;

    //parameterized constructor to initialize sides of triangle
    public TriangleWithConstructor(int sideOne ,int sideTwo ,int sideThree)
    {
         firstSide=sideOne;
         secondSide=sideTwo;
         thirdSide=sideThree;
    
    } 
    //method to claculate perimeter of triangle
    public int perimeter()
    {
        int perimeter=firstSide+secondSide+thirdSide;
        return perimeter;
    }
    //method to claculate area of triangle
    public double area()
    {
        int s=(firstSide+secondSide+thirdSide)/2;
        double areaOfTriangle=Math.sqrt(s*(s-firstSide)*(s-secondSide)*(s-thirdSide));
        return  areaOfTriangle;
    }
    

    public static void main(String[] yh)
    {
        //object creation for the class TriangleWithConstructor
        TriangleWithConstructor triobj=new TriangleWithConstructor(3,4,5);
        
        //method calls
        int p=triobj.perimeter();
        double a=triobj.area();
        
        //output
        System.out.println("perimeter of triangle is: "+ p);
        System.out.println("area of triangle is     : "+ a);


    }
    
}

    

