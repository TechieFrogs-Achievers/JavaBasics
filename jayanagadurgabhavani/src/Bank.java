public class Bank 
{
    public float getBalance()
    {
       return(0);
    }
    public static void main(String[] args) 
    {
        Bank ba=new Bank();// bank a
        System.out.println(" BankA amount is:"+ba.getBalance());
        Bank bb=new Bank();// bank b
        System.out.println("Bank B amount is:"+bb.getBalance());
        Bank bc=new Bank();// bank c
        System.out.println(" Bankc amount is:"+bc.getBalance());
    }
}
// bank a extends for bank
class BankA extends Bank
{
    public float getBalance()
    {
        float amount=1000;
        return amount;
    }
}
// bank b extends for bank
class BankB extends Bank
{
    public float getBalance()
    {
        float amount=1500;
        return amount;
    }
}
// bank c extend for bank
class BankC extends Bank
{
    public float getBalance()
    {
        float amount=2000;
        return amount;
    }
}