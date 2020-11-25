//super class
class PurchaseItem
{
    private String name ;
    private double UnitPrice;
    //constructor for super class
    PurchaseItem()
    {
       name =getName();
       UnitPrice= getUnitPrice();
    } 
    public double getprice(int quantity)
    {
        return UnitPrice*quantity;
    }
    // using accesor method for price
    public void setunitprice(double price)
    {
        UnitPrice = price;
        System.out.println("unitPrice = "+price);
    }
    public  double getUnitPrice()
    {
        return UnitPrice;
    }
    //using accesor method for return name
    public String getName()
    {
        return name;
    }
    // mutator method for name
    public void setName(String n)
    {
        name = n;
        System.out.println("Name ="+ n);
    }
}
// sub class
class WeightItem extends PurchaseItem
{
    private double Weight;
    // using Accesor method
    public void getData()
    {
        System.out.println("Weight="+Weight);
    }

}
// sub class
class CounterItem extends PurchaseItem
{
    private int quantity;
    // subclass constuctor
    public CounterItem(int quantity)
    {   
        // this constuctor for quantity
        this.quantity= quantity;
    }
    // method for display quantity
    void display()
    {
        System.out.println("quantity ="+quantity);
    }
}
class Challenge
{
    public static void main(String[] args)
    {   
        //creating object for sub class
        CounterItem c = new CounterItem(20);
        c.display();//calling method for quantity
        
    }
}
