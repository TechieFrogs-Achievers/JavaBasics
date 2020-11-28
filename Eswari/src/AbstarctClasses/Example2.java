package AbstarctClasses;

//abstract class
abstract class Bank
{
    //abstract method
    abstract void getBalance();
}

//sub class for bankA
class BankA extends Bank
{
    //abstract method implementation
    void getBalance()
    {
        System.out.println("$100");
    }
}
//second sub class for bankB
class BankB extends Bank
{
    //abstract method implementation
    void getBalance()
    {
        System.out.println("$150");
    }
}
//third sub class
class BankC extends Bank
{
    void getBalance()
    {
        System.out.println("$200");
    }
}

//main class
public class Example2 {
    public static void main(String[] args) {
        Bank bankObject = new BankA();              //upcasting
        bankObject.getBalance();                    //method calling
        Bank bankObject1 = new BankB();             //second subclass object creation
        bankObject1.getBalance();
        Bank bankObject2 = new BankC();              //third subclass object creation
        bankObject2.getBalance();
    }
}
