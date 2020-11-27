//super class 
class VenilaIceCream
{
    //ice cream method for printing flavour
    public void iceCream()
    {
        System.out.println("Venila Ice Cream");
    }
}

//sub class
class ChocolateIceCream extends VenilaIceCream
{
    //method overriding 
    public void iceCream()
    {
        super.iceCream();
        System.out.println("Chocolate ice cream");
    }
}

public class MethodOverRideExample 
{
    public static void main(String[] args) {
        ChocolateIceCream c = new ChocolateIceCream();          //child class object creation
        c.iceCream();                                   //calling method
    }
    
}
