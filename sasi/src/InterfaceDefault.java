interface RectanglePolygon2 //interface class 
{
    /* static int TotalSides(int t) // static method 
     {
        return t;
     }*/
    abstract  int getNUmsides(); //abstract method 
    abstract int getSidelength();
     int getPerimeter();
     double  getInteriorAngle( );
}
class EquilateralTriangle1 implements RectanglePolygon2 // parent class inherites the interface
{
    int side;
    int length;
    /*EquilateralTriangle1(int s) // constructor  for parent method
    {
       side=s;
    }*/
    @Override
      public int getNUmsides() //method for parent class
    {
        return side;
    }
    public int getSidelength()
    {
        return length;
    }
    public  int getPerimeter()
    {
       // int length,n;
        return side*length;
    }
    public double getInteriorAngle()
    {
       // int n;
        return (((side-2)*3.14)/side);
    }
     }
     class Square8 implements RectanglePolygon2 //child class implemts interface
     {
         int side;
         int  len;
        /* Square8(int s) //constructor for child class
         {
             side=s;
         }*/
         @Override
         public int getNUmsides() //methods for child class
         {
             return len;
         }
         public int getSidelength()
         {
             return side;
         }
         public  int getPerimeter()
         {
            // int length,n;
             return side*len;
         }
         public double  getInteriorAngle()
         {
             return (((side-2)*3.14)/side);
         }
        /* public static int TotalSides()
         {
             return 
         }*/
             } 
          class InterfaceDefault
          {
    /*{
        static int TotalSides(int t) //satic method 
        {
            return  t;
        }*/
        public static void main(String[] args)
         {
             EquilateralTriangle1 e=new EquilateralTriangle1(); //object creation for parentclass
             e.side=2;
             e.length=6;
             System.out.println(e.getNUmsides());
             System.out.println(e.getSidelength());
             System.out.println(e.getPerimeter());
             System.out.println(e.getInteriorAngle());
             Square8 s=new Square8();
             s.side=2;
             s.len=3;
             // object for child class 
              System.out.println(s.getNUmsides());
             System.out.println(s.getSidelength());
             System.out.println(e.getPerimeter());
             System.out.println(e.getInteriorAngle());
             /*int t=e.getNUmsides()+s.getNUmsides(); //total number sides adding
             System.out.println("the number of sides:" +InterfaceStatic.TotalSides(t));*/
         }
        }
