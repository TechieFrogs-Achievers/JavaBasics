package inheritence;

class PurchaseItem
{
    // private instance variable, not accessible from outside this class
    private double unitprice ;
    private String name;
    //a constructor
    public PurchaseItem()
    {

    }
    //a mutator to assign value to private variable
    public void setName(String name)
    {
        this.name=name;
    }
    //a mutator to assign value to private variable
    public void setUnitprice(double unitprice)
    {
        this.unitprice=unitprice;
    }
    //a accessor to retrive value to private variable
    public String getName(String name)
    {
        return name;
    }
    //a accessor to retrive value to private variable
    public double getUnitprice(double d)
    {
         return unitprice;
    }
    //a public method to return unitprice
    public double getPrice()
    {
        return unitprice;
    }

}

class WeighedItem extends PurchaseItem
{
    // private instance variable, not accessible from outside this class
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
    // a mutator to assign value to private variable
    public  void setWeight(double weight)
    {
        this.weight=weight;
    }
    //a accessor to retrive value to private variable
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
    // private instance variable, not accessible from outside this class
    private int quantity;

    public CountedItem()
    {
    
    }
    //a mutator to retrive value to private variable
    public  void setQuantity(int quantity)
    {
        this.quantity=quantity;
    }
    //a accessor to retrive value to private variable
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
        //declaring and allocating instnce of class weighteditem
        WeighedItem obj = new  WeighedItem();
        obj.setName("apple");
        obj.getUnitprice(8.5678);
        obj.setWeight(2.963);
        

        //declaring and allocating instnce of class counteeditem
        CountedItem obj1=new  CountedItem();
        obj1.setName("boll");
        obj1.setUnitprice(3.8554);
        obj1.setQuantity(25);


       
    }
}







