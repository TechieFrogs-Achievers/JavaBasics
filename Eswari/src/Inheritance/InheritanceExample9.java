//package Inheritance;

//class for purchased Item
class PurchaseItem
{
    private String name;
    private double unitPrice;
    PurchaseItem()
    {
        name = getName();
        unitPrice = getUnitPrice() ;
    }
    //getting price from quantiy varaible and unitprice
    public double getPrice(int quantity)
    {
        return unitPrice * quantity;
    }
    //set price method
    public void setUnitPrice(double price)
    {
        unitPrice = price;
    }
    //getting unitprice
    public double getUnitPrice()
    {
        return unitPrice;
    }
    //getting name from set name
    public String getName()
    {
        return name;
    }
    //setting name
    public void setName(String purchaseName)
    {
        name = purchaseName;
    }
}
//sub class
class WeighedItem extends PurchaseItem
{
    private double weigth;
    //constructor
    public WeighedItem(int w)
    {
        this.weigth = w; 
    }
    //getting weight 
    public double getWeigth()
    {
        return weigth;
    }
}

//sub class
class CountedItem extends PurchaseItem
{
    private int quantity;
    //constructor
    CountedItem(int quantity)
    {
        this.quantity = quantity;
    }
    //display method for showing value
    public void display()
    {
        System.out.println("Quantity :" +quantity);
    }
}
public class InheritanceExample9 
{
    public static void main(String[] args) {
        CountedItem ci = new CountedItem(40);                   //child class object creation
        ci.display();                                           //methods calling
        ci.setName("soap");
        System.out.println("The item name is " +ci.getName());
        ci.setUnitPrice(40);
        System.out.println("The price of one quantity is " +ci.getUnitPrice());
        System.out.println("The price is " +ci.getPrice(5));
    }
    
}
