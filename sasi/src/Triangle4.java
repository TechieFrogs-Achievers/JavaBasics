public class Triangle4
 {
     int a,b,c;
    Triangle4(int side1,int side2,int side3)
     {
     a=side1;
     b=side2;
     c=side3;
     }
    void areaDisplay()
    {
       double s=(a+b+c)/2;
       double area=Math.pow(s*(s-a)*(s-b)*(s-c),s);
       System.out.println(area);
    }
     void perimeterDisplay()
    {
       int perimeter=(a+b+c);
        System.out.println(perimeter);
    }
public static void main(String[] args)
 {
    Triangle4 tc=new Triangle4(3,4,5);
    tc.areaDisplay();
    tc.perimeterDisplay();
}
}
