class PurchaseItem
{
    private String name;        //defining variables as private
    private double unitPrice;


    public PurchaseItem(String x,double y)                    //constructor for initializing variables
    {
        name = x;                           
        unitPrice = y;
    }

    public double getPrice()        //getter to get the value  of unitprice
    {
        return unitPrice;
    }

    public void setName(String name)    //setter for assigning name
    {
        this.name = name; 
    }

    public void setUnitPrice(double unitPrice)  //setter for assigning value
    {
        this.unitPrice = unitPrice;
    }

    public String getNmae()     //getter for name
    {
        return name;
    }

    public Double getUnitPrice()  //getter for unitprice
    {
        return unitPrice;
    }
}

class WeighedItem extends PurchaseItem
{
    private double weight;

    public WeighedItem(String x,double y,double w)      //accessing constructor by using super
    {
        super(x,y);
        this.weight = w;
    }
    public double getPrice()         //overridden mathod 
     {
        return weight*super.getPrice();
     }
}


class CountedItem extends PurchaseItem
{
    private int quantity;

    public CountedItem(String x,double y,int q)     //accessing constructor by using super
    {
        super(x,y);
        this.quantity = q;
    }

    public double getPrice()        //overridden method from parent class
    {   
        return quantity*super.getPrice();   
    }

}

public class Challenge
 {
 public static void main(String[] args)
  {
        WeighedItem wi = new WeighedItem("rice",55.00,25.00);   //object creation

        System.out.println(wi.getPrice());      //print the price

    }
}
