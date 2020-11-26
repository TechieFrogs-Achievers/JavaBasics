class  RectangleS  //parent class
{
 int len;        //data members
 int breadth;
 void Area()  // method for parent class
 {
    System.out.println((len*breadth));
 }
 void perimter()  //method for parent class
 {
        System.out.println((2*(len+breadth)));
 }
  public RectangleS( int l,int b) //constructor for parent class initilize with parameters
{
    len=l;   
    breadth=b;   //data members
}
class Square extends RectangleS // child class
{
    int side;
    Square(int s)  //constructor for child class
    {
        super( s,s); //super method to inherit side
    }
}
}
class RectangleAndSquare   
{
    public static void main(String[] args) 
    {
        RectangleS r=new RectangleS(2,5); //object creaction for parent class
        r.Area(); //calling  method with object from parent class
        r.perimter(); //calling  method with object from parent class
        Square s=new Square(); // object creation for child class


    }
}
