package AbstractionClassModels;
//abstract parent class
abstract class Shape{
    abstract void  RectangleArea(int length,int breadth);
    abstract void  SquareArea(int side);
    abstract void  CircleArea(int radius);
}

//child classs
class Area extends Shape{
    // overrride abstract Rectanglearea method
     public void RectangleArea(int length,int breadth){
        int RectangleArea=length*breadth;
        System.out.println("Area of rectangle is :"+ RectangleArea);
     }

     //override abstract squarearea method
     public  void  SquareArea(int side){
         int squarearea=side*side;
         System.out.println("Area of square is :"+ squarearea);
     }

     //override abstract circlearea method
     public  void  CircleArea(int radius){
         double circlearea=(3.14)*(radius*radius);
         System.out.println("Area of square is :"+ circlearea);
     }
}


public class Abstractinclass6 
{
    public static void main(String[] args)
    {
        //creating obj for area class
        Area a=new Area();
        a.RectangleArea(6,8);//calling Rectanglearea method 
        a.SquareArea(9);//calling squarearea method 
        a.CircleArea(4);//calling circlearea method 
    }
}
