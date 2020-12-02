package Interface;

interface RegularPolygon 
{
    //abstract methods
    abstract int getNumsides();   
    abstract int getSidelength();
    
}
class EquilateralTriangle implements RegularPolygon   //subclass inherits the parentclass
{
    int side;     //instance variable
    EquilateralTriangle(int s)    //constructor
    {
        side = s;
    }
    public int getNumsides()
    {
        return(3);
    }
    public int getSidelength()
    {
        return(side);
    }
}
class Square implements RegularPolygon      //subclass2 inherits the parent class
{
    int side;
    Square(int s)     //constructor class
    {
        side = s;
    }
    @Override
    public int getNumsides()
    {
        return(4);
    }
    public int getSidelength()
    {
        return(side);
    }

public static void main(String[] args) {
    EquilateralTriangle e = new EquilateralTriangle(8);   //creating method for the subclass 
    System.out.println("the equilateralTriangle of side is:"+e.getNumsides());
    System.out.println("the equilateralTriangle of length is:"+e.getSidelength());  //displays the result
    Square s = new Square(8);   //creating method for the subclass2
    System.out.println("the square of side is:"+s.getNumsides());
    System.out.println("the square of length is:"+s.getSidelength());
}

} 