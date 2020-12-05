interface RectanglePolygon1 //interface class 
{
     static int TotalSides(int t) // static method 
     {
        return t;
     }
    abstract  int getNUmsides(); //abstract method 
    abstract int getSidelength();
}
class EquilateralTriangle implements RectanglePolygon1 // parent class inherites the interface
{
    int side;
    EquilateralTriangle(int s) // constructor  for parent method
    {
        side=s;
    }
    @Override
      public int getNUmsides()
    {
        return 3;
    }
    public int getSidelength()
    {
        return side;
    }
     }
     class Square7 implements RectanglePolygon1 //child class implemts interface
     {
         int side;
         Square7(int s) //constructor for child class
         {
             side=s;
         }
         @Override
         public int getNUmsides()
         {
             return 4;
         }
         public int getSidelength()
         {
             return side;
         }
        /* public static int TotalSides()
         {
             return 
         }*/
             } 
    class InterfaceStatic
    {
        static int TotalSides(int t) //satic method 
        {
            return  t;
        }
        public static void main(String[] args)
         {
             EquilateralTriangle e=new EquilateralTriangle(6); //object creation for parentclass
             System.out.println(e.getNUmsides());
             System.out.println(e.getSidelength());
             Square7 s=new Square7(2); // object for child class 
              System.out.println(s.getNUmsides());
             System.out.println(s.getSidelength());
             int t=e.getNUmsides()+s.getNUmsides(); //total number sides adding
             System.out.println("the number of sides:" +InterfaceStatic.TotalSides(t));
         }
}