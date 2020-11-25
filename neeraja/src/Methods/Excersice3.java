package Methods;

class Calculate
{
    //public method to claculate area of triangle
    public void areaCalculation(int length,int breadth)
    {
        System.out.println("Area of reactangle :" + (length*breadth) + " sq.mts");
    }
    //public method to calculate area of square
    public void areaCalculation(int side )
    {
        System.out.println("Area f Square :" + 4*side + " sq.mts");
    }
}

public class Excersice3 {
    public static void main(String[] args) {
        //instance of class calculate to invoke methods
        Calculate a = new Calculate();
        a.areaCalculation(2, 3);//passing two parameters
        a.areaCalculation(4);  //passing single parameter
        //compiler will call the method according to no of arguments
    }
}
