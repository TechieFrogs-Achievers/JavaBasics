class AreaOfSqandRe //parent class
{
    void Area(int len,int breadth) //method for parent class 
    {
        int rectangle=len*breadth; //data members
        System.out.println("rectangle:"+rectangle);
    }
    void Area(int side) //method for parent class
    {
        int square=side*side; //data member
        System.out.println("square:"+square);
    }
public static void main(String[] args) 
{
    AreaOfSqandRe a=new AreaOfSqandRe(); //object cration for parent class
    a.Area(3,5);  //calling the method with object from parentclass
    a.Area(4,6); //calling the method with object from parent class
}
}