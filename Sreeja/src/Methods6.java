class Bank
{
    public void getBalance()     //method for get balance
    {
        return ;
    }
}
class BankA extends Bank
{
    public void getBalance()        //overridden method 
    {
        int amountDeposited = 1000;
        System.out.println("BankA:"+amountDeposited);
    }
}

class BankB extends Bank         
{
    public void getBalance()        //overridden method
    {
        int amountDeposited = 1500;
        System.out.println("BankB:"+amountDeposited);
    }
}

class BankC extends Bank
{
    public void getBalance()        //overridden method
    {
        int amountDeposited = 2000;
        System.out.println("BankC:"+amountDeposited);
    } 
}


public class Methods6
 {
     public static void main(String[] args) 
     {
       
       //object creation for three classes

        BankA a = new BankA();
        BankB b = new BankB();      
        BankC c = new BankC();

        //method calling

        a.getBalance();
        b.getBalance();
        c.getBalance();


    }
}
