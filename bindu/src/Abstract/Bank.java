package Abstract;

abstract class Bank 
{
    abstract void getBalance();  //creating method
}
class BankA extends Bank      //subclass extends parent class
{
    void getBalance()
    {
        System.out.println("$100");    //prints the subclass
    }
}
class BankB extends Bank
{
    void getBalance()
    {
        System.out.println("$150");
    }
}
class BankC extends Bank
{
    void getBalance()
    {
            System.out.println("$200");
    }
    public static void main(String[] args)
     {
         Bank b = new BankA();  //upcasting
         Bank b1 = new BankB();
         Bank b2 = new BankC();
         b.getBalance();    //calling the method with object
         b1.getBalance();
         b2.getBalance();
        
    }
}


