interface RegularPolygon
{
    abstract int getNumSides();
    abstract int getSideLength(int side);
}
     
class EquilateralTriangle implements RegularPolygon
{
   public int getNumSides()
   {
     return 3;
   }
   int side;
   EquilateralTriangle(int s)
   {
     side=s;
   }
   public int getSideLength(int side) {
       return side;
   }
}
class Square3 implements RegularPolygon
{
    public int getNumSides()
    {
        return 4;
    }
    int side;
    Square3(int s)
    {
      side=s;
    }
    public int getSideLength(int side)
    {
        return side;
    }
}
class InetrfaceClass1
{
    public static void main(String[] args) {
        EquilateralTriangle et=new EquilateralTriangle(10);
        System.out.println(et.getNumSides());
       System.out.println(et.getSideLength(20));
        Square3 s=new Square3(30);
        System.out.println(s.getNumSides());
       System.out.println( s.getSideLength(30));

    }
}
