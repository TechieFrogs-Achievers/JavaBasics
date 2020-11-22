class AcessSpecifier 
{
    
    int side1=3,side2=4,side3=5;
  private AcessSpecifier()
    {
    int a,b,c;
    a=side1;
    b=side2;
    c=side3;
    }
   private void areaDisplay()
   {
      double s=(side1+side2+side3)/2;
      double area=Math.pow(s*(s-side1)*(s-side2)*(s-side3),s);
      System.out.println(area);
   }
   private void perimeterDisplay()
   {
      int perimeter=(side1+side2+side3);
       System.out.println(perimeter);
   }
public static void main(String[] args)
{
   AcessSpecifier s=new AcessSpecifier();
   s.areaDisplay();
   s.perimeterDisplay();
}
   }

