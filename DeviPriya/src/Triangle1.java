public class Triangle1 {
    int area,perimeter,side1=3,side2=4,side3=5;
    Triangle(int)
    {
       // int s1=3;
        //int s2=4;
    }
    void display()
    {
      area= 1/2*s1*s2*s3;
      perimeter=s1+s2+s3;
      System.out.println("area is"  + area,"perimeter is " + perimeter);
    }

    public static void main (String args[])
    {
        Triangle t1= new Triangle ();
        t1.display();


    }

    
}
