import java.util.*;
public class Area 
{
    //declaring parameters
    int length;
    int width;

    //method to set data into fields
    public void setDim(int length, int width)
    {
        this.length=length;
        this.width=width;
    }
 
    //method to get data from object
    public int getArea()
    {
       int  area=length*width;
        return area;
    }
     
public static void main(String[] ij)
 {
     Scanner sc=new Scanner(System.in);

     //taking inputs from keyboard
     System.out.println(" enter length of ectangle: ");
     int len_rectangle=sc.nextInt();
     System.out.println(" enter length of ectangle: ");
     int wid_rectangle=sc.nextInt();

     //object creation for the class Area
     Area recobj=new Area();

     //callinf method 
    recobj.setDim(len_rectangle , wid_rectangle);

    //printing area of rectangle
    System.out.println("area of rectangle is:"+recobj.getArea());
 }
    
}
