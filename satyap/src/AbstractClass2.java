abstract class Bank1 // abstract class Bank
{
    abstract int getBalance(int amount); // abstract method getBalance()
}
class BankA1 extends Bank1 // Subclass1 for Bank
{
    public int getBalance(int amount) // extending abstract method
    {
       return amount;
    }
}
class BankB1 extends Bank1 // Subclass2 for Bank
{
    public int getBalance(int amount) // Extending abstract method
    {
        return amount;
    }
}
class BankC1 extends Bank1 // subclass3 for Bank
{
   public int getBalance(int amount) // Extending abstract method
    {
        return amount;
    }
}
public class AbstractClass2 // Driver class
{
    public static void main(String[] args) {
        Bank1 b1=new BankA1(); // upcasting for BankA1
        System.out.println(b1.getBalance(100)+"$"); // method calling for BankA1
        Bank1 b2=new BankB1(); //upcasting for BankB1
        System.out.println(b2.getBalance(150)+"$"); // method calling for BankB1
        Bank1 b3=new BankC1(); // upcasting for BankC1
        System.out.println(b3.getBalance(200)+"$"); // method calling for BankC1
    }
}
