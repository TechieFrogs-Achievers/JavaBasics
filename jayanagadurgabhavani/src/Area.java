public class Area 
{
    int length ;
    int breadth;

   void setDim( int l, int b)
   {
      length = l;
      breadth = b;  

   }
   // used by public
    public int getArea()
    {
        // area farmula is l*b;
        int Area = length* breadth;
        return Area ;

    }
    public static void main(String[] args) 
    {
        // by used in constractors
        Area a = new Area ();
        a.setDim( 66 , 28);
        System.out.println("area:" + a.getArea());
    }
}
