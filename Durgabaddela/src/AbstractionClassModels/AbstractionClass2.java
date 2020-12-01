package AbstractionClassModels;
abstract class Bank//abstract class
{
    int amount;
    abstract void getBalance(int balance);//abstract method
}
//childclass inherites parent class

class BankA extends Bank
{
    void getBalance(int balance)//override method
    {
        amount = balance;
      System.out.println("BankA: deposited amount = $"+amount);
    }
}
//childclass inherites parent class

class BankB extends Bank
{
    
    void getBalance(int balance)
    {
        amount = balance;
      System.out.println("BankB: deposited amount =$"+amount);
    }
}
//childclass inherites parent class

class BankC extends Bank
{
    
    void getBalance(int balance)
    {
        amount = balance;
      System.out.println("BankC: deposited amount  =$"+amount);
    }
}

public class AbstractionClass2 
{
    public static void main(String[] args)
    {
    Bank a = new  BankA(); //obj creation for BankA
    a.getBalance(100);//calling method in BankA
    Bank b = new  BankB(); //obj creation for BankB
    b.getBalance(150);//calling method in BankB
    Bank c = new  BankC(); //obj creation for BankC
    c.getBalance(200);//calling method in BankC
    
    }
}
