class MethodEx3
{
    public void area(int length,int breadth)        //mthod for area of rectangle
    {
        int area = length * breadth;
        
        System.out.println("Area of rectangle:"+area);
    }

    public void area(int side)      //method for area ofsquare
    {
        int area = side*side;
    
        System.out.println("Area of the square:"+area);
    }

}

public class Methods3 
{
     public static void main(String[] args)
      {
        MethodEx3  m3 = new MethodEx3();        //object creation

        m3.area(5,7);       //method calling with object

        m3.area(7);         //method calling with object

    }    
}
