import java.util.Scanner;
class Area1
{
    int length,breadth;
    //create parameterized constructor 
    Area1(int l,int b)
    {
        length=l;
        breadth=b;
    }
    //method for calculate area of rectangle
    public void returnArea()
    {
        int area=length*breadth;
        System.out.println("Area of Rectangle:"+area);
    } 

}
public class RectangleProgram2 
{
    public static void main(String[] args) 
    {
      Area1 a=new Area1(3,4);//assign values
      a.returnArea();//method calling 
      Scanner sc = new Scanner(System.in);//take input from kryboard
        System.out.println("enter the length of the Rectangle:");
        int a1=sc.nextInt();
        System.out.println("enter the length of the Rectangle:");
        int b=sc.nextInt();
        a.returnArea();

    }
    
}
