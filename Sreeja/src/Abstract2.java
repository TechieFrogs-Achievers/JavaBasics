//creating abstract class

abstract class Bank1
{
    abstract void getBalance();     //abstract method
}

class BankA1 extends Bank1
{
    int money = 100;
    
    //implementation of abstract method
   
    void getBalance()
    {
        System.out.println(money);
    }
}

class BankB1 extends Bank1
{
    int money = 150;

    //implementation of abstract method

    void getBalance()
    {
        System.out.println(money);
    }
}

class BankC1 extends Bank1
{
    int money = 200;
    
    //implementation of abstract method
    
    void getBalance()
    {
        System.out.println(money);
    }
}
public class Abstract2
 {
     public static void main(String[] args) 
     {
        //creating objects for subclasses
        
        Bank1 ba = new BankA1();
        Bank1 bb = new BankB1();
        Bank1 bc = new BankC1();


        //method calling with three objects

        ba.getBalance();
        bb.getBalance();
        bc.getBalance();
     }
    
}
