import java.util.Scanner;

//import sun.security.util.Length;

// import java.util.Scanner;
//area class  is used calculating area of a rectangle
class Area
{
    int l,b;
    //setDim method is used for defining variables for calculating area
    public void setDim(int length, int breadth)
    {
        l=length;
        b=breadth;

    }
    //getArea method is used for displaying area
    public int getArea()
    {
        int area= l * b;
        return area;
    }
}


public class ClassesAndObjectsProgram6 {
    public static void main(String[] args) {
        Area a= new Area();    //object creation
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length: ");
        int length = sc.nextInt();
        System.out.println("Enter the breadth: ");
        int breadth = sc.nextInt();

        a.setDim(length, breadth);
        System.out.println(a.getArea());
    }
    
}
