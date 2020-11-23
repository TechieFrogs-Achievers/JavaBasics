class  RectangleS
{
 int len;
 int breadth;
 void Area()
 {
    System.out.println((len*breadth));
 }
 void perimter()
 {
        System.out.println((2*(len+breadth)));
 }
  public RectangleS( int l,int b)
{
    len=l;
    breadth=b;
}
class Square extends RectangleS
{
    int side;
    Square(int s)
    {
        super( s,s);
    }
}
}
class RectangleAndSquare
{
    public static void main(String[] args) 
    {
        RectangleS r=new RectangleS(2,5);
        Square s=new Square(5);
       
    }
}
