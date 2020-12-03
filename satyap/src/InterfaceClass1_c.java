interface RegularPolygon2 // interface
{
    abstract int getNumSides(); // abstract method
    void getPerimeter(); // non-abstract methods
    void getInteriorAngle();
}
class EquilateralTriangle2 implements RegularPolygon2 //extending Subclass to interface 
{
    int num,side; //instance var
   public int getNumSides() // abstract methods
   {
     return num;
   }
   public void getPerimeter() //abstracting non abstract methods
   {
       
       int perimeter=num*side;
       System.out.println("Perimeter:"+perimeter);
   }
   public void getInteriorAngle() 
   { 
       double angle=((num-2)*3.14/num);
       System.out.println("Angle:"+angle);

   }
   
}
class Square5 implements RegularPolygon2 // subclass implementing interface
{
    int num,side;
    public int getNumSides() // abstract method
    {
        return num;
    }
    public void getPerimeter() //non=-abstract method
    {
        
        int perimeter=num*side;
        System.out.println("Perimeter:"+perimeter);
    }
    public void getInteriorAngle() 
    { 
        double angle=((num-2)*3.14/num);
        System.out.println("Angle:"+angle);

    }
    
}
class InterfaceClass1_c //driver class
{
    public static void main(String[] args)
    {
        EquilateralTriangle2 et=new EquilateralTriangle2(); // obj creation for Subclass
        et.num=3; //intializing values
        et.side=5;
        et.getPerimeter(); // method calling for getPerimeter
        et.getInteriorAngle(); // method calling for getInteriorAngle
        Square5 s=new Square5(); // obj creation for Subclass2
        s.side=4;
        s.num=4;
        s.getPerimeter(); //method calling for getPerimeter
        s.getInteriorAngle(); // method calling for getInteriorAngle
        
    }
}
