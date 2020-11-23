 class Rectangleclass
{
    int length;
    int breadth;
    //constructor of class 
    // using parameter
     Rectangleclass(int l , int b)
    {
        length =l;
        breadth = b;

    }
     // creating a method for Rectangele area
    void Area()
    {
        System.out.println("the area  is -" +length*breadth);

    }
     // creating a method for Rectangele peremiter
    void Perimeter()
    {
        System.out.println( "the perimeter is -" +2*length+breadth);
    }
    
}
// extend class of rectangle 
class Square extends Rectangleclass
{
    int side;
    // creating construct for sub class
    Square( int s)
    { 
        super(s,s);
    }
    // method for square 
    /* void Areasquare()
    {
         int area = side*side; 
         System.out.println(area);
    }
    void Perimetersquare()
    {
        int perimeter = (4*side);
        System.out.println(perimeter);
    }*/
}
    public class Inheritance4
    {
        public static void main(String[] args) 
        {
            Rectangleclass r = new Rectangleclass(8,7);
            r.Area();
            r.Perimeter();
            Square s = new Square (8);
            s.Area();
            s.Perimeter();


            
        }

    }
    




