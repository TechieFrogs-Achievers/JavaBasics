public class Constructor 
{
    int a;
    int b;
    int c;
    Constructor(int k1, int k2, int k3)
    {
        a=k1;
        b=k2;
        c=k3;

    }
    void getArea(int a,int b,int c)
    {
        int s=(a+b+c)/2;
        int area=s*(s-a)*(s-b)*(s-c);
        System.out.println(area);
    }
    void areaofperimeter(int a,int b,int c)
    {
        int perimeter=(a+b+c);
        System.out.println(perimeter);
    }
    public static void main(String args[])
    {
        Constructor cs=new Constructor(2,3,4);
        cs.areaofperimeter(2,3,4);
        cs.getArea(2,3,4);
    }
    
}
