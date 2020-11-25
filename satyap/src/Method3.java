class Area // Area class
{
    void area(int side) //method overloading
    {
        int square=side*side;
        System.out.println("Area of Square:"+square);
    }
    void area(int length,int breadth)
    {
        int rectangle=length*breadth;
        System.out.println("Area of Rectangle:"+rectangle);
    }
}
public class Method3 //main class
{
    public static void main(String[] args) {
        Area a=new Area(); // obj creation for area class
        a.area(3); // method calling for area(int)
        a.area(10,20); // method calling for (int,int)
    }
}
