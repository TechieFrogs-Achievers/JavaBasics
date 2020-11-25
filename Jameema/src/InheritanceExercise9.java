class PurchaseItem
{
    private String name;
    private double unitPrice;
    PurchaseItem( String ItemName , double ItemUnitPrice)
    {
        name=ItemName;
        unitPrice=ItemUnitPrice;
    }
    public double getprice()
    {
        return unitPrice;
    }
    void setPrice(double uPrice)
    {
        unitPrice=uPrice;
        System.out.println("unitPrice  :"+uPrice);
    }
    public String getName()
    {
        return name;
    }
    void setName(String sname)
    {
        name=sname;
        System.out.println("name  :" +sname);
    }

}
class WeighedItem extends PurchaseItem
{
    
}
public class InheritanceExercise9
 {
    
}
