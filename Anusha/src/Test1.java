class Triangle1
{
   int a,b,c;
   //cretae a constructor
   Triangle1(int s1,int s2,int s3)
   {
    a=s1;
    b=s2;
    c=s3;
   } 
   //method for area of triangle
   public double area()
    {
      double s=(a+b+c)/2;
      return (double)Math.sqrt(s*(s-a)*(s-b)*(s-c)); 
    }
    //method for perimeter of triangle
    public double perimeter()
    {
       double s=(a+b+c)/2;
       return s;
    }

}
  public class Test1
  {
   public static void main(String[] args) 
   {
      Triangle1 t=new Triangle1(3,4,5);//assign values
      System.out.println(" Area of Traingle:"+t.area());
     System.out.println(" Perimeter of Traingle:"+t.perimeter());
      
   } 
}
