// import java.util.Scanner;

class Area
{
    // Scanner sc= new Scanner(System.in);
    // int l=sc.nextInt();
    // int b=sc.nextInt();
    int l,b;
    public void setDim(int length, int breadth)
    {
        l=length;
        b=breadth;

    }
    public int getArea()
    {
        int area= l * b;
        return area;
    }
}


public class ClassesAndObjectsProgram6 {
    public static void main(String[] args) {
        Area a= new Area();
        a.setDim(5, 4);
        System.out.println(a.getArea());
    }
    
}
