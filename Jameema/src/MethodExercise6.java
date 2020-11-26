class Bank
{
    public int getBalance() //creating method
    {
        return 0; //return o

    }
}
class BankA
{
    public String getBalance(String x)
    {
        return x; //return bankA value

    }
}
class BankB
{
    public String  getBalance(String x)
    {
        return x; //return BankB value
    }
}
class BankC
{
    public String getBalance(String x)
    {
        return x; //return BankC value
    }
}
public class MethodExercise6 
{
    public static void main(String[] args) 
    {
        Bank b = new Bank();// creating object
        b.getBalance(); //calling method
        System.out.println("default value  :" +b.getBalance()); 
        BankA b1 = new BankA();
        System.out.println("BankA deposited :" +b1.getBalance("$1000")); //printing the BankA value
        BankB b2 = new BankB();
        System.out.println("BankB deposited :" +b2.getBalance("$1500")); //print the BankB value
        BankC b3 = new BankC();
        System.out.println("BankC deposited :" +b3.getBalance("$2000")); //print the BankC value
        
    }
    
}
