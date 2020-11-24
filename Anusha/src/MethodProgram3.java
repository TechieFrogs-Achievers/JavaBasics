public class MethodProgram3 
{
    //method for area of rectangle
    public void Area(int length,int breadth)
    {
       int area=length*breadth;
       System.out.println("Area of Rectangle="+area);
    }
    //method for area of square
    public void Area(int side)
    {
        int area=side*side;
        System.out.println("Area of a Square:"+area);
    }
   public static void main(String[] args)
    {
       MethodProgram3 m3=new MethodProgram3();//object creation
       m3.Area(5,4);//assign values
       m3.Area(5);//assign values
   } 
}
