import java.util.Scanner;

public class Area
 {
     int a, b;
     public void SetDim(int length , int breadth) //parameterised methods
     {
         a=length;
         b=breadth;
     }
     public int getArea() //without parameters 
     {
         int area=a*b;
         return area; //return area
     }
     public static void main(String[] args)
      {
        Scanner s = new Scanner(System.in); //scanner
          int length,breadth;
          System.out.println("enter the length ");
          length = s.nextInt();
          System.out.println("enter the breadth");
          breadth = s.nextInt();
          Area a = new Area(); //creating object to class
          a.SetDim(length,breadth);
          System.out.println("the area of rectangle" +a.getArea()); // printing the area and calling method by using object

         
     }
    
}
