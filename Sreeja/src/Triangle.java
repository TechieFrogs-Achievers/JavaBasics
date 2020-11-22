public class Triangle
 {
    int side1 = 3;      //Initializing data members
    int side2 = 4;
    int side3 = 5;


    public void Area()      // method to calculate area
    {
        double s = ( side1 + side2 + side3 ) /2;
        double area = Math.sqrt ( s * (s-side1) * (s-side2) * (s-side3) );
       
        System.out.println(area);
    }
    
    public void  perimeter()        //method to calculate perimeter
    {
        double perimeter = side1 + side2 + side3;
        System.out.println(perimeter);
    }

     public static void main(String[] args) 
     {
        Triangle tr = new Triangle();   //creating an object for class Triangle
       
        tr.Area();          //method calling
        tr.perimeter();
    }

}
