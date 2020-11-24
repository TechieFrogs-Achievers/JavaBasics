public class Triangles 
{
    double b;
    double h;
    double s;
    void areaoftriangle(double base,double height)
    {
        b=base;
        h=height;
        double area;
        area=0.5*b*h;
        System.out.println(area);
    }
    void  areaofperimeter(double side)
    {
        s=side;
        double perimeter;
        perimeter=s+s+s;
        System.out.println(perimeter);
    }
    int k;
    Triangles()
    {
        double var=k;
        System.out.println(var);
        

    }
    public static void main(String args[])
    {
        Triangles t1=new Triangles();
        t1.areaofperimeter(2.4);
        t1.areaoftriangle(3,4);
    }
    
}
