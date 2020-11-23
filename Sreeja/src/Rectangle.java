public class Rectangle 
{
    int length;         //definining variables
    int breadth;

    Rectangle(int a,int b)      //parameterized constructor
    {
        length = a;
        breadth = b;
    }

     int area()             //creating method to calculate area
    {
        int area = length*breadth;
        return area;
    }
     public static void main(String[] args)
      {
          Rectangle rec = new Rectangle(4,5);   //creating objects
          Rectangle rec1 = new Rectangle(5,8);
       
          System.out.println(rec.area());     //method calling
          System.out.println(rec1.area());
         
    }
}
