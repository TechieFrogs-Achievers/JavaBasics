package Methods;

//super class for bank
class Bank
{
    //method for showing balance in bank
    public String getBalance()
    {
        return "0";
    }

}

//sub class
class BankA extends Bank
{
    //method for showing balance in bankA
    public String getBalance(String balance)
    {
        return balance;
    }
}

//second sub class
class BankB extends Bank
{
    //method for showing balance in bankB
    public String getBalance(String balance)
    {
        return balance;
    }
}

//third sub class
class BankC extends Bank
{
    //method for showing balance in bankC
    public String getBalance(String balance)
    {
        return balance;
    }
}

public class MethodExample5
{
    public static void main(String[] args) {
        Bank b = new Bank();                                                            //object creation for super class
        System.out.println(b.getBalance());                                             //super class method calling
        BankA aA = new BankA();                                                         //object creation for sub class
        System.out.println("The bank A balance is "+aA.getBalance("$1000"));              //sub class method calling
        BankB bB = new BankB();                                                          //object creation for sub class
        System.out.println("The bank B balance is " +bB.getBalance("$1500"));             //sub class method calling
        BankC cC = new BankC();                                                             //object creation for sub class
        System.out.println("The bank C balance is " +cC.getBalance("$2000"));             //sub class method calling
    }
}
