package InheritanceDoc;

class PurchaseItem //parent class
{
    private String name;
    private double unitPrice;
    PurchaseItem(String n ,double i)//constructor having 2 params
    {
        name = n; 
        unitPrice =i;
    } 
  public String getName(String n) //method to return name 
  {
      return name;
  } 
  public double getPrice(double i) //mehod to return price 
  {
      return unitPrice;
  } 
  public void setName( String n )//method to set values
  {
      this.name = n;
  } 
  public void setPrice(double i)//method to set values
  {
      this.unitPrice = i;
  }

} 

class WeighedItem extends PurchaseItem //inherit the properties of parent class
{
     private double weight;
     public WeighedItem(String n , double i, double w)//constructor having 3 params
     {
         super(n, i); this.weight = w; //invoking parent class constructor using super keyword
     } 
     public double getPrice(double i) //overridden mathod of parent class
     {
         return i * weight;
     }
} 
class CountedItem extends PurchaseItem //inherit the properties of parent class
{
    private int quantity;
     public CountedItem(String n , double i , int q) //3 param constructor
     {
         super(n, i); this.quantity = q; //invoking parent class constructor using super keyword
     }  
     public double getPrice(double i) // overridden method of parent class
     {
         return i*quantity;
     }

}
 
public class Program9 
{ 
    public static void main(String[] args) 
    {
        WeighedItem wt = new WeighedItem("Sugar", 30, 2); //object creation

        System.out.println( " total price if sugar " +wt.getPrice(30)); //print statement to print values 

        CountedItem ct = new CountedItem("Salt", 10 , 2);//pbject creation

        System.out.println( " total price of salt is " +ct.getPrice(10));
        
    }
    
}
