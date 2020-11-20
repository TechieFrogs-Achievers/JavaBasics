class Area2
 {
    int l,b;
    public void setDim(int length,int breadth)
     {
        l=length;
        b=breadth;
    }
    public int getArea()
    {
        int area=l*b;
        return area;
    }
}
public class AreaOfRectangle6
{
public static void main(String[] args)
 {
    Area2 a=new Area2();
    a.setDim(5,4);
    System.out.println(a.getArea());
 }
}
