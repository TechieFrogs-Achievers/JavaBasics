import java.util.*;
public class AreaOne 
{
    //declaring instance variables
    float length;
    float width;

    //parameterized constructor to initialize object
    public AreaOne(float length,float width)
    {
      this.length=length;
      this.width=width;
    }

    //method to return area of recangle
    public double returnArea()
    {
       double area=(length*width);
       return area;
    }


    public static void main(String[] ij)
 {
     Scanner sc=new Scanner(System.in);

     //taking inputs from keyboard
     System.out.println(" enter length of ectangle: ");
     float len_rectangle=sc.nextFloat();
     System.out.println(" enter length of ectangle: ");
     float wid_rectangle=sc.nextFloat();

     //object creation for the class Area
     AreaOne recobj=new AreaOne(len_rectangle,wid_rectangle);

     //storing returned value
     double areaOfRectangle=recobj.returnArea();

     //printing output
     System.out.println("areaOfRectangle is : "+areaOfRectangle);
 }
    
}
