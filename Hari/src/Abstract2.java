abstract class Bank1
{
    abstract void getBalance();   
}
class BankA1 extends Bank1
{
    void getBalance()
    {
        System.out.println("100");
    }
}
class BankB1 extends Bank1
{
    void getBalance()
    {
        System.out.println("150");
    }
}
class BankC1 extends Bank1
{
    void getBalance()
    {
        System.out.println("200");
    }
}
class Abstract2 
{
    public static void main(String[] args)
    {
        BankA1 a = new BankA1();
        BankB1 b = new BankB1();
        BankC1 c = new BankC1();
        a.getBalance();
        b.getBalance();
        c.getBalance();
    }
}