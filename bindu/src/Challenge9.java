class PurchaseItem   //parent class
{
    private String name;    // private Datamembers 
    private double unitPrice;
    PurchaseItem()          //constructor for parent class
    {
        name = getName();             //intializing the parameters
        unitPrice = getunitPrice();
    }
    public double getprice(int quantity) //accessor method for price
    {
        return unitPrice*quantity;
    }
    public void setunitPrice(double price)   //mutators for setprice
    {
        unitPrice = price;
        System.out.println("unitPrice:" +price);
    }
    public double getunitPrice()    
    {
        return unitPrice;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name = n;
        System.out.println("Name:"+n);
    }
}
class WeightItem extends PurchaseItem       //child class for parentitem
{
    private double Weight;
    public void getData()
    {
        System.out.println("Weight:"+Weight);
    }
}
class CounterItem extends PurchaseItem   //child class for counteritem
{
    private int quantity;
    public CounterItem(int quantity)
    {
      this.quantity = quantity;
    }
    void Display()             //create method to display quantity
   {
     System.out.println("quantity:" +quantity);
   }
}

class Challenge9
{
    public static void main(String[] args) 
    {
        CounterItem c = new CounterItem(20); //create object for subclass
        c.Display();
        
    }
}
















