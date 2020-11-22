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

    }
}
