public class Rectangle
 {
     int length;
     int width;

     //parameterized constructor to initialize parameters
     public Rectangle(int rec_Length, int rec_Width)
     {
        length=rec_Length;
        width=rec_Width;
    }

     //method to calculate area of rectangle
     public int area()
     {
         int rec_Area=length*width;
         return rec_Area;
     }

     public static void main(String[] tg)
    {
        //Object creations and method calls
        Rectangle rec=new Rectangle(4,5);
        int areaOfRectangle1=rec.area();
        Rectangle rec1=new Rectangle(5,8);
        int areaOfRectangle2=rec1.area();
        
        //priniting area of rectangles
        System.out.println( " areaOfRectangle one is  :"+ areaOfRectangle1);
        System.out.println( " areaOfRectangle two is  :"+ areaOfRectangle2);


    }
    
}
