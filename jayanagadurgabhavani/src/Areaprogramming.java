public class Areaprogramming 
{
    int l,b;
    Areaprogramming(int length, int breadth)
    //used in datatype n int
    {
        l=length;
        b=breadth;
    }
    public int returnAreaprogrammng()
    {
        // area farmula l*b
        int area =l*b;
        return area;
    }

public static void main(String[] args) 
{
    Areaprogramming ar=new Areaprogramming(566, 528);
    System.out.println(ar.returnAreaprogrammng());
}
}
