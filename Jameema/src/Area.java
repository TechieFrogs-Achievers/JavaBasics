import java.util.Scanner;

public class Area
 {
     int a, b;
     public void SetDim(int length , int breadth)
     {
         a=length;
         b=breadth;
     }
     public int getArea()
     {
         int area=a*b;
         return area;
     }
     public static void main(String[] args)
      {
        Scanner s = new Scanner(System.in);
          int length,breadth;
          System.out.println("enter the length ");
          length = s.nextInt();
          System.out.println("enter the breadth");
          breadth = s.nextInt();
          Area a = new Area();
          a.SetDim(length,breadth);
          System.out.println("the area of rectangle" +a.getArea());

         
     }
    
}
