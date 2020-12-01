package AbstractExercises;
// Abstract class
 abstract class Bank
{   
    // abstract method 
    abstract void getBalance();
    
}
//child class 1 
class BankA extends Bank//inheriting properties from Bank
{
    void getBalance()//Method
    {
        System.out.println("$100");//printing
    }
}
class BankB extends Bank//inheriting properties from Bank
{
    void getBalance()//Method
    {
       System.out.println("$150");
    }
}
class Bankc extends Bank//inheriting properties from Bank
{
    void getBalance()//Method
    {
        System.out.println("$200");
    }
}
public class AbstractProgram2
{
    public static void main(String[] args) 
    {   
        //Upcasting 
        Bank a = new BankA();
        Bank b = new BankB();
        Bank c = new Bankc();
        //calling method 
        a.getBalance();
        b.getBalance();
        c.getBalance();
        
    }
}
