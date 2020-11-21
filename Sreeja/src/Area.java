public class Area 
{
    int a;
    int b;

    public void setDim(int length,int breadth)
    {
       a = length;
       b = breadth; 
    }

    public void getArea()
    {
        int area = a*b;
        System.out.println(area);
    }
    public static void main(String[] args) 
    {
        Area A1= new Area();
        A1.setDim(8,9);
        A1.getArea();
    }
    
}
