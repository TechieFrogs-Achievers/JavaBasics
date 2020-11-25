package MethodsPractices;

public class MethodExample2 
{
    int length;
    int breadth;
    int side;

    //method to print the area of rectangle

    public void areaDisplay(int l , int b)
    {
        length = l;
        breadth = b;
        System.out.println(" Area of rectangle  is ="+(length*breadth));
    }

    //method to print the area of a square

    public void areaDisplay(int s )
    {
        side = s;
        System.out.println("Area of a square is =" +(side*side));
    }
    public static void main(String[] args)
    {   
        // creating object for class

        MethodExample2 m = new MethodExample2();
        
        // calling methods with object

        m.areaDisplay(4,7);
        m.areaDisplay(5);
    }
 
}
