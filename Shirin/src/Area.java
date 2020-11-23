public class Area 
{
    int length ;
    int breadth;

   void setDim( int l, int b)
   {
      length = l;
      breadth = b;  

   }
    public int getArea()
    {
        int Area = length * breadth;
        return Area ;

    }
    public static void main(String[] args) 
    {
        Area a = new Area ();
        a.setDim( 4 ,8);
        System.out.println(a.getArea());
    
        
    }
    
}
