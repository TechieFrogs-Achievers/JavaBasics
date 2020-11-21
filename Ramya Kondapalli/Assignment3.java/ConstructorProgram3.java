class Triangle{
    int a,b,c;
    //int a=3,b=4,c=5;
    //method to calculate area
    public void area()
    {
        float s= (float) (0.5 * a * b);
       double areaOfTraingle = (float)Math.sqrt((s - a) * (s - b) * (s - c));
       //using math function for square root operation
       System.out.println("Area of traiangle : "+ areaOfTraingle);
    }
    //method to calculate perimeter
    public void perimeter()
    {
       int perimeterOfTraiangle = a+b+c;
       System.out.println("Periemter of traiangle : " + perimeterOfTraiangle);
    }
}
public class ConstructorProgram3 {
    public static void main(String[] args) {
    Triangle t = new Triangle();
    t.a = 3; 
    t.b = 4;
    t.c = 5;   
    t.area(); //method calling
    t.perimeter(); //method calling
    }
}
