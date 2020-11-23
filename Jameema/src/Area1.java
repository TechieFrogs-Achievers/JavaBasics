import java.util.Scanner;

public class Area1
 {
     int length,breadth;
     Area1(int l,int b) //parameterised constructor
     {
         length=l; //assining parameters to variables
         breadth=b;
     }
     int returnArea() //int method
     {
         return length*breadth; //return value
     }
     public static void main(String[] args)
      {
          Scanner s = new Scanner(System.in);
          System.out.println("enter the values");
          int l,b;
          l=s.nextInt();
          b=s.nextInt();
          Area1 a = new Area1(l,b); //creating object to class
          System.out.println("the area of rectangle " + a.returnArea()); //printing area and calling method with object
         
     }

    
}
