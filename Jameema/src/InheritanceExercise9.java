class PurchaseItem //parent class
{
    private String name; //datamembers as private
    private double unitPrice;
    PurchaseItem() //constructor for parent class
    {
        name=getName(); //initializing datatypes for parameters
        unitPrice=getUnitPrice();
    }
    public double getprice(int quantity) //accessor method for price
    {
        return unitPrice*quantity;
    }
    public void setUnitPrice(double Price) //mutators for setprice
    {
        unitPrice=Price;
        System.out.println("unitPrice  :"+Price);
    }
    public double getUnitPrice() //accessor for getunitprice
    {
        return unitPrice;

    }
    public String getName() //accessor for getname
    {
        return name;
    }
    void setName(String n) //mutator for setname
    {
        name=n;
        System.out.println("name  :" +n);
    }

}
class WeighedItem extends PurchaseItem //inherits parent class details
{
    private double weight; //private datamember
    public void getData() //accessor for getdata
    {
        System.out.println("Weigh: " +weight);
    }
    
}
class CounterItem extends PurchaseItem //inherits parentclass details
{
    private int Quantity;
    public CounterItem(int q) //constructor for counteritem
    {
        Quantity=q;  
    }
    void Display()
    {
        System.out.println("quantity :"+Quantity);
    }

}
public class InheritanceExercise9
 {
     public static void main(String[] args)
      {
          CounterItem c = new CounterItem(40); //creating object
          c.Display(); //method calling
          c.setName("soap");
          System.out.println("the item name is "+c.getName());
          c.setUnitPrice(40);
          System.out.println("the price of one quantity "+c.getUnitPrice());
          System.out.println("the price is "+c.getprice(5));
         
     }
    
}
