package Abstract;
abstract class Bank //abstract class
{
    abstract void getBalance(); //abstract method
} 
class BankA extends Bank //inherits abstract details
{
    void getBalance() //method
    {
        System.out.println("$100");
    }

}
class BankB extends Bank //inherits abstract class details
{
    void getBalance()
    {
        System.out.println("$150"); //printing the value
    }
}
class BankC extends Bank  //inherits abstract class details
{
    void getBalance()
    {
        System.out.println("$200");
    }

}

public class AbstractExercise2
{
    public static void main(String[] args) 
    {
        Bank b1 = new BankA(); //upcasting
        Bank b2 = new BankB();
        Bank b3 = new BankC();
        b1.getBalance(); //calling method
        b2.getBalance();
        b3.getBalance();
        
        
    }
    
}
