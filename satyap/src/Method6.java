class Bank // parent class
{
    public int getBalance() // accessor methods
    {
        
        return 0;
    }
}
class BankA extends Bank // child class
{
    public int getBalance() // acessors methods
    {
        return 1000;
    }
}
class BankB extends Bank // child class
{
    public int getBalance() // accessor methods
    {
        return 1500;
    }
}
class BankC extends Bank // child class
{
   public int getBalance() // acessors methods
    {
        return 2000;
    }
}
public class Method6 // main class
{
    public static void main(String[] args) {
        BankA b1=new BankA(); //obj creation for child class 
        b1.getBalance(); // method calling for bank A getbalance()
        BankB b=new BankB(); // obj creation for bank B for parent class
        b.getBalance(); // method calling for bank B getbalance()
        BankA a= new BankA();
        a.getBalance(); 
        Bank obj=new Bank(); // method calling for Bank 
        obj.getBalance();// method calling for getbalance() parent class
    }
}
