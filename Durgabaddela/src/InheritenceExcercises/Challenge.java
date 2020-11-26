package InheritenceExcercises;
class PurchaseItem
{
    // private instance variable

    private double unitprice ;
    private String name;

    // constructor

    public PurchaseItem()
    {

    }
    //setter to assign value to private variable

    public void setName(String name)
    {
        this.name=name;
    }
    //setter to assign value to private variable

    public void setUnitprice(double unitprice)
    {
        this.unitprice=unitprice;
    }
    //getter to return value to private variable

    public String getName(String name)
    {
        return name;
    }
    //getter to return value to private variable

    public double getUnitprice(double d)
    {
         return unitprice;
    }
    // method to return unitprice

    public double getPrice()
    {
        return unitprice;
    }

}

class WeighedItem extends PurchaseItem
{
    // private instance variable

    private double weight;
    //constructor

    public  WeighedItem(double weight) 
    {
     this.weight=weight;
    }
    //default constructor

    public WeighedItem() 
    {
    }
    // setter to assign value to private variable
    
    public  void setWeight(double weight)
    {
        this.weight=weight;
    }
    //setter to retrive value to private variable

    public double getWeight()
    {
        return weight;
    }
    //over-riding method to retrive price

    public double getPrice()
    {
    return weight*super.getPrice();
    } 
    public void  display()
    {
        //System.out.println(name+" "+unitprice+"units "+getPrice()+"RS");
    }


}
class CountedItem extends PurchaseItem
{
    //private data

    private int quantity;

    public CountedItem()
    {

    }
    //setter to assign value to private variable
    public  void setQuantity(int quantity)
    {
        this.quantity=quantity;
    }
    //getter to return value to private variable

    public double getQuantity()
    {
        return quantity;
    }
    //over-riding method to retrive price

    public double getPrice()
    {
        return quantity*super.getPrice();
    }
}

public class Challenge
{
  public static void  main(String[] tf)
    {
        //declaring  instnce of class weighteditem
        WeighedItem obj = new  WeighedItem();
        obj.setName("ball");
        obj.getUnitprice(6.4578);
        obj.setWeight(1.955);


        //declaring  instnce of class counteeditem
        CountedItem obj1=new  CountedItem();
        obj1.setName("cup");
        obj1.setUnitprice(3.3424);
        obj1.setQuantity(45);
    }
}
    




