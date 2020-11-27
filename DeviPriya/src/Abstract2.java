abstract class Bank
{
    abstract void getBalance();
}
class BankA extends Bank{
    void getBalance()
    {
        System.out.println("$100 deposited in BankA");
    }
}
class BankB extends Bank{
    void getBalance()
    {
        System.out.println("$150 deposited in BankA");
    }
}
class BankC  extends Bank{
    void getBalance()
    {
        System.out.println("$200 deposited in BankC");
    }
}
public class Abstract2 {
    public static void main(String[] args) 
    {
        Bank b = new BankA();
        b.getBalance();
        Bank b1 = new BankB();
        b1.getBalance();
        Bank b2 = new BankC();
        b2.getBalance();


    }

    
}
