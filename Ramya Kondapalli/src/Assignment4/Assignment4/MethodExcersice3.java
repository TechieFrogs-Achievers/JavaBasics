package Assignment4;
class area{
    public void areaCalculation(int l,int b)
    {
        System.out.println("Area of reactangle :" + (l*b) + " sq.mts");
    }
    public void areaCalculation(int s )
    {
        System.out.println("Area f Square :" + 4*s + " sq.mts");
    }
}
public class MethodExcersice3 {
    public static void main(String[] args) {
        area a = new area();
        a.areaCalculation(2, 3);//passing two parameters
        a.areaCalculation(4);  //passing single parameter
        //compiler will call the method according to no of arguments
    }
}
