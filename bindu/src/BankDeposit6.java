class Bank 
{
    //creating the method
    public int getBalance()
    {
        return 0; //return 0
    }
}
class BankA
{
    String getBalance(String deposit) //create the method for bankA
    {
        return deposit;
    }
}
class BankB
{
    String getBalance(String deposit)
    {
        return deposit;  //return the deposit for BankB
    }
} 
class bankClass
{
    String getBalance(String deposit)
    {
        return deposit;
    }
}
public class BankDeposit6 
{
    public static void main(String[] args) 
    {
        Bank b = new Bank();  //creating method for the super class
        b.getBalance();
        BankA b1 = new BankA();  // creating object for the childclass 
        BankA b2 = new BankA();
        BankA b3 = new BankA();
        System.out.println("BankA deposit:" +b1.getBalance("$1000"));  //calling methods
        System.out.println("BankB deposit:" +b2.getBalance("$1500"));
        System.out.println("BankC deposit:" +b3.getBalance("$2000"));
    }
    
}