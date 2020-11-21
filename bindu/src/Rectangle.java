public class Rectangle {
    int length;
    int breadth;
    Rectangle(int l,int b)
    {
        length=l;
        breadth=b;
    }
    void Area()
    {
    System.out.println((length*breadth)); 
    }
   public static void main(String[] args) 
{
    Rectangle r1=new Rectangle(4,5);
    Rectangle r2=new Rectangle(5,8);
    r1.Area();
    r2.Area();
    
}

    
}
