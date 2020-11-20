public class Triangle1 
{
    // using parameter
    int s1;
    int s2;
    int s3;
    Triangle1 ( int side1 , int side2 , int side3)
    {
        s1 =  side1;
        s2 = side2;
        s3 = side3;
    }
    void Area ()
    {
      double s = (s1+s2+s3)/2;
      double area= Math.sqrt(s*(s-s1)*(s-s2)*(s- s3));
      System.out.println(area);
    }
     void perimeter ()
   {
     int perimeter = (s1+s2+s3);
     System.out.println(perimeter);


    }
    
 public static void main(String[] args) 
    {
        Triangle1 t = new Triangle1(2 , 4 , 3 );
        t.Area();
        t.perimeter();
        
    }
}
