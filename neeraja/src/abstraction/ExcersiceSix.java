package abstraction;

//abstract parent class
abstract class Shape{
    abstract void  RectangleArea(int length,int breadth);
    abstract void  SquareArea(int side);
    abstract void  CircleArea(int radius);
}

//child classs
class Area extends Shape{
    //implementation of abstract Rectanglearea method
     public void RectangleArea(int length,int breadth){
        int rec_Area=length*breadth;
        System.out.println("Area of rectangle is :"+rec_Area);
     }

     //implementation of abstract squarearea method
     public  void  SquareArea(int side){
         int sq_area=side*side;
         System.out.println("Area of square is :"+sq_area);
     }
     
     //implementation of abstract circlearea method
     public  void  CircleArea(int radius){
         double cir_area=(3.14)*(radius*radius);
         System.out.println("Area of square is :"+cir_area);
     }
}


public class ExcersiceSix 
{
    public static void main(String[] g){
         //instantiation of bankA using parent class reference
        Area ar=new Area();
        ar.RectangleArea(3,5);//calling Rectangle method using  reference
        ar.SquareArea(6);//calling square method using  reference
        ar.CircleArea(7);//calling circle method using  reference
    }
    
    
}
