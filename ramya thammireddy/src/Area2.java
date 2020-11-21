 class Area2 
{
    int l,b;
    Area2(int length, int breadth)
    {
        l=length;
        b=breadth;

    }
    public int returnArea()
    {
        int area= l*b;
        return area;
    }

    

public static void main(String args[])
{
    Area2 a= new Area2(20,30);
    System.out.println(a.returnArea());

}
}
