import java.util.*;
class Area
{
    int length,breadth;
   //create a setdim method
   public void setDim(int l,int b)
   {
    length = l;
    breadth = b;
    
   }
   //method for area of rectangle
   public void getArea()
   {
       int area = (length *breadth);
       System.out.println("Area of Rectangle = " + area);
   }
}

public class RectangleProgram1 
{
    public static void main(String[] args) 
    {
       Area a=new Area();//object creation
       a.setDim(4,5);//assign values
      a.getArea();//method calling 
      Scanner sc=new Scanner(System.in);//take input from keyboard
      System.out.println("Enter length of the Rectangle: ");
      int a1=sc.nextInt();
      System.out.println("enter the breadth of the Rectangle:");
      int b=sc.nextInt();
      a.getArea();

    }
}
