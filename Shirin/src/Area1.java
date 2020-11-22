public class Area1 
{
    // program 7
    int length;
    int breadth;
    int Area;
     Area1 ( int l , int b )
    {
      length = l;
      breadth = b;

    }
    void returnArea()
    {
       Area = length * breadth;
       System.out.println(Area);
    }
    public static void main(String[] args)
    {
        Area1 a = new Area1(9 , 5);
        a. returnArea();

        
    }
    
}
