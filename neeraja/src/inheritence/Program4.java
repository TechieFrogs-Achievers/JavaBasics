package inheritence;
import java.util.*;

//parent class
class Rectangle 
{
    float length;
    int width;

    //parent class constructor
    public Rectangle(float length , int breadth)
    {
        this.length=length;
        this.width=breadth;
    }
    //method to  calcuate area of rectangle
    void area()
    {
        double  rec_Area=length*width;
        System.out.println(rec_Area);
    }
    //method to calculate perimeter of rectangle
    void perimeter()
    {
        double  rec_perimeter=2*(length+width);
        System.out.println(rec_perimeter);
    }

  

}

class Square extends Rectangle
{
        int side;

        //child class constructor
        Square(int s)
        {
            super(s,s);
        }
        //method to  calcuate area of square
         public void squareArea()
         {
            int area = side * side;
            System.out.println(area);
         }
         //method to  calcuate perimeter of square
         public void squarePerimeter()
         {
             int perimeter = 4 * side;
             System.out.println(perimeter);
         }
}


public class Program4
{
    public static void main(String[] ij)
    {
        for(int i=1; i<=10; i++)
        {
         
            Scanner scan=new Scanner(System.in);
            float x=scan.nextFloat();
            int y=scan.nextInt();
            int z=scan.nextInt();
        
        //parent class object
        Rectangle r = new Rectangle(x,y);
        r.area();
        r.perimeter();

        //child class object
        Square s = new Square(z);
        s.squareArea();
        s.squarePerimeter();
         }
     }
    
}
