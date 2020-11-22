public class Triangle 
{
    //initializing sides of triangle
    int firstSide;
    int secondSide;
    int thirdSide;

    //constructor
   /* Triangle(int firstSide,int secondSide,int thirdSide)
    {
      this.firstSide=firstSide;
      this.secondSide=secondSide;
      this.thirdSide=thirdSide;
    }*/
    
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
       // Triangle triobj=new Triangle(3,4,5);
        
        /* triobj.firstSide=3;
           triobj.secondSide=4;
           triobj.thirdSide=5;
        */


        // method calls
        int p=triobj.perimeter();
        double a=triobj.area();

        // printing output
        System.out.println("perimeter of triangle is: "+ p);
        System.out.println("area of triangle is     : "+ a);


    }
    
}
