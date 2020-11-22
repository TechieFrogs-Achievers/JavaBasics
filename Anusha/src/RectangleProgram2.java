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
      Area1 a=new Area1(4,5);//assign values
      a.returnArea();//method calling 
    }
    
}
