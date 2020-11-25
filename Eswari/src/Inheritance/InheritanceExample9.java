package Inheritance;

//class for purchased Item
class PurchaseItem
{
    private String name;
    private double unitPrice;
    PurchaseItem(String n , double p)
    {
        name = n;
        unitPrice = p;
    }
    public void getPrice()
    {
        System.out.println("Unit price is  " +unitPrice);
    }
    public void setName(String purchaseName)
    {
        name = purchaseName;
    }
}
//sub class
// class WeighedItem extends PurchaseItem
// {
//     private double weigth;
//     public WeighedItem(int weigth)
//     {
//         this.weigth = weigth; 
//     }
//     public void getWeigth()
//     {
//         return weigth;
//     }
// }

//sub class
class CountedItem extends PurchaseItem
{
    private int quantity;
    CountedItem(int quantity)
    {
        this.quantity = quantity;
    }
}
public class InheritanceExample9 {
    
}
