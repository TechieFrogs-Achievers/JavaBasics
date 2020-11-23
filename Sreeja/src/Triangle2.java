public class Triangle2
 {
    
    int side1;  //defining variables
    int side2;
    int side3;

   Triangle2(int a,int b,int c)     //creating parameterized constructor
    {
     side1 = a;
     side2 = b;
     side3 = c;
    }

    void Area()                    //creating a method to calculate and print the area
    {
        double s=(side1+side2+side3)/2;
        double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        System.out.println(area);
    }
    void perimeter()            //method to calculate and print the perimeter 
    {
        double perimeter = side1+side2+side3;
        System.out.println(perimeter);
    }

     public static void main(String[] args) 
     {
        Triangle2 tr = new Triangle2(3,4,5);    //creating object
    
        tr.Area();      //method calling
        tr.perimeter();
    }
}
