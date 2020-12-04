interface RectanglePolygon //interface class 
{
    abstract  int getNUmsides(); // abstract methods 
    abstract int getSidelength();
}
class EquilateralTriangle implements RectanglePolygon // parent class inherits interface 
{
    int side;
    EquilateralTriangle(int s) // constructor for parent class 
    {
        side=s;
    }
    @Override
      public int getNUmsides() //method for parent class 
    {
        return 3;
    }@Override
    public int getSidelength()
    {
        return side;
    }
     }
     class Square7 implements RectanglePolygon //child class inherit the inherit interface
     {
         int side;
         Square7(int s)
         {
             side=s;
         }
         public int getNUmsides()
         {
             return 4;
         }
         @Override
         public int getSidelength()
         {
             return side;
         }
     } 
    class InterfacePolygon
    {
        public static void main(String[] args)
         {
             EquilateralTriangle e=new EquilateralTriangle(6); //object creations for parent class 
             System.out.println(e.getNUmsides()); 
             System.out.println(e.getSidelength());
             Square7 s=new Square7(2); //object creation for child class 
              System.out.println(s.getNUmsides());
             System.out.println(s.getSidelength());
         }
}