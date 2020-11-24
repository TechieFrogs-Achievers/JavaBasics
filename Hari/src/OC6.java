class Area
{
    int length,breadth;
    Area(int l, int b)
    {
        length = l;
        breadth = b;
    }
    public int setDim()
    {
        int results = length * breadth;
        return results;
    }
    public void getArea()
    {
        System.out.println("Area = " +  setDim());
    }
}
class OC6 
{
    public static void main(String []args)
    {
        Area area =new Area(6 , 5);
        area.getArea();  
    }
}
