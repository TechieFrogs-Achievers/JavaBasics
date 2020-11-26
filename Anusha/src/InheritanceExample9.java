public class InheritanceExample9 
{
    public static void main(String[] args)
     {
        CounterItem c=new CounterItem(20); // obj creation for child class
         c.display();
    }
}
class PurchaseItem // parent class
{
    private String name; // datamembers as private
    private double unitPrice;
    PurchaseItem(String n,double price) // constructor for parent class
    {
        name=getName();    // intializing datatypes for parameters
        unitPrice=getUnitPrice();
    }
    public double getPrice(int quantity) // accessor for getprice
    {
        return unitPrice*quantity;
    }
    public void setUnitPrice(double price) //mutators for setprice
    {
        unitPrice=price;
        System.out.println("UnitPrice:"+price);
    }
    public double getUnitPrice() // accessor for get unit price
    {
        return unitPrice;
    }
    public String getName() // accesor for getname 
    {
        return name;
    }
    public void setName(String n) // mutator for setname
    {
        name=n;
        System.out.println("Name:"+n);
    }
}
class WeightedItem extends PurchaseItem // child classWeightedItem
{
    private double weight; // private datamembers
    public void getData() // accessor for getdata 
    {
       System.out.println("weight:"+weight);
    }

}
class CounterItem extends PurchaseItem // child class for CounterItem
{
    private int quantity;
   public CounterItem(int quantity) // constructor for counerItem
    {
        this.quantity=quantity; //this constructor for quantity

    }
    void display() // display method for display quantity
    {
        System.out.println("quantity:"+quantity);
    }
}