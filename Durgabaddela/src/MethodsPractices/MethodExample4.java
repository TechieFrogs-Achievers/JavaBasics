package MethodsPractices;

//Bank as a parent class

class Bank
{
    
    static int amount;
    // method which returns balance amount as 0

    static void getBalance(int balance) {
        amount = balance;
        System.out.println("balance = "+Bank.amount);
    }
}
// sub class inherites the parent class

 class BankA extends Bank
 {
     //method which prints the deposited amount 
    void getBalance() 
    {
        System.out.print("Bank A: ");

        //calling the method in parent class

        getBalance(1000); 
    }        
}

// sub class inherites the parent class

class BankB extends Bank
{
    //method which prints the deposited amount

    void getBalance()
    {
            System.out.print("Bank B: ");

            //calling the method in parent class

            getBalance(1500); 
     }
}

// sub class inherites the parent class

class BankC extends Bank
{
    //method which prints the deposited amount

    void getBalance()
    {
            System.out.print("Bank c: ");

            //calling the method in parent class

            getBalance(2000); 
    }
}
public class MethodExample4 {
    public static void main(String[] args) 
    {
        //calling the method in super class by using class name
        
       Bank.getBalance(0);

       //craeting objects for 3 subclasses

       BankA a = new BankA();
       BankB b = new BankB();
       BankC c = new BankC();

       //calling the methods in subclasses

       a.getBalance();
       b.getBalance();
       c.getBalance();
    }
}
