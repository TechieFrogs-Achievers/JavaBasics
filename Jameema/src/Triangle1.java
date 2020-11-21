public class Triangle1 
{
    int a,b,c;
    Triangle1(int length , int breadth , int height)
    {
        a=length;
        b=breadth;
        c=height;
        double s=(a+b+c)/2;
        double area= Math.sqrt(s*(s-a)*(s-b)*(s-c))/2;
        double perimeter=(a+b+c);
        System.out.println("the area of triangle :"+area);
        System.out.println("the perimeter of triangle:"+perimeter);

    }
    public static void main(String[] args) 
    {
        Triangle1 t= new Triangle1(3,4,5);
        
    }
    
}
