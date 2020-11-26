// Creating super class
class Bank
{
    void getBalance()
    {
        System.out.println("Money deposited by Person = 0");
    }
}
// Creating ub class 1
class BankA extends Bank
{
    void getBalance(int a)
    {
        System.out.println("Money deposited by person = " + a);
    }
}
// Creating sub class 2
class BankB extends Bank
{
    void getBalance(int b)
    {
        System.out.println("Money deposited by person = " + b);
    }
}
// Creating sub class 3
class BankC extends Bank
{
    void getBalance(int c)
    {
        System.out.println("Money deposited by person = " + c);
    }
}
class Method6
{
    public static void main(String[] args)
    {
        BankA a = new BankA();
        BankB b = new BankB();
        BankC c = new BankC();
        a.getBalance(1000);
        b.getBalance(1500);
        c.getBalance(2000);
    }
}
