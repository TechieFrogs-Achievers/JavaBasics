 class PurchaeItem // grandparent class 
{
    private String  name;    // data members 
    private double priceunit;
PurchaeItem() //constructor for grandparent class
{
    name=getName();    
    priceunit =getPriceUnit();
}
public double  getPrice(int quantity) 
{
    return priceunit*quantity; // return the values 
}
    public void setPriceUnit( double price)    //.acess and mutors
    {
        priceunit=price;
        System.out.println("priceunit:"+price);
    }
    public double getPriceUnit()
    {
        return priceunit;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name=n;
        System.out.println("name:"+n);
    }
}
class WeighedItem extends PurchaeItem  // parent class 
{
    private double weight;  // data members
    public void getDate()      // method for parent class
    {
		System.out.println("weight:"+weight);
    }
}
class CounterItem extends WeighedItem  // child class getting  properties from grand parent
{
    private int quality; //data member 
    public CounterItem(int quality) 
     {
        this.quality=quality;
	}
    void display()
    {
        System.out.println("quality:"+quality);
    }
}
class PurchaeItem1
{
    public static void main(String[] args)
     {
         CounterItem ci=new CounterItem(20); // objection created for  child class 
         ci.display(); //calling the method with object from child class
     }
    }


