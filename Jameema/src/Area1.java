import java.util.Scanner;

public class Area1
 {
     int length,breadth;
     Area1(int l,int b)
     {
         length=l;
         breadth=b;
     }
     int returnArea()
     {
         return length*breadth;
     }
     public static void main(String[] args)
      {
          Scanner s = new Scanner(System.in);
          System.out.println("enter the values");
          int l,b;
          l=s.nextInt();
          b=s.nextInt();
          Area1 a = new Area1(l,b);
          System.out.println("the area of rectangle " + a.returnArea());
         
     }

    
}
