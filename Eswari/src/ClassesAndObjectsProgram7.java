//class for calculating area
class Area1
{
    int l,b;
    //constructor
    Area1(int length, int breadth)
    {
        l=length;
        b=breadth;
    }
    //method creation
    public int returnArea()
    {
        int area= l * b;
        return area;
    }
}

public class ClassesAndObjectsProgram7 {
    public static void main(String[] args) {
        Area1 a= new Area1(10,20);    //object creation
        System.out.println(a.returnArea());
    }
    
}
