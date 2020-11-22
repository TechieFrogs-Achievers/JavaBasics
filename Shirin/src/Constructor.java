 class Products 
{
    //constructor chaining
     public Products()
    {    
         String name1 = "frezee";
         String colour = "black";
         System.out.println("Name of the product is :" +name1+"  "+colour);

    }
    public Products(int cost)
    {
        this();
        System.out.println("the product  cost is: " +cost);
    }
    public Products(String brand)
    {
        this(15000);
        System.out.println("the  product brand  is: "+brand);
    }

    
}
public class Constructor
{
    public static void main(String[] args)
    {
        Products p1 = new Products("Samsung");
        
    }
}
