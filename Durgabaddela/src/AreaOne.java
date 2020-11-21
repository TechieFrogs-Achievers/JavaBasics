import java.util.Scanner;

public class AreaOne 
{
  int l;
  int b;

  //constructor with parameters

  public AreaOne(int length, int breadth)  
  {
     l = length;
     b = breadth;
  }

  //method for return Area

  public int returnArea()
  {
    int Area = (l*b);
    return Area;
  }
  public static void main(String[] args)
  {
      // read inputs from keyboard

      Scanner sc = new Scanner(System.in);
      System.out.println(" enter length");
        int a = sc.nextInt();
        System.out.println(" enter breadth");
        int b = sc .nextInt();

        // object creation for instance class

        AreaOne obj = new AreaOne(a,b);
       int areaOfRectangle = obj.returnArea();
        System.out.println("Area of rectangle:" + areaOfRectangle);

  }
}
