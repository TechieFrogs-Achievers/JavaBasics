package Methods;

class Bank{
    //create getBalance method to return '0' value
    int amount;
    //getbalance method to retun amount 
    void getBalance(int balance)
    {
        amount = balance;
        System.out.println(amount);
    }
}
    //creating 3 subclasses
    //these subclasses invokes super class
    ////bankA  class extending bank class
    class BankA extends Bank{
        //overriding parent class method
        void getBalance() {
            System.out.print("Bank A: ");
            getBalance(1000); //calling the method in super class
        }        
    }
    //bankb  class extending bank class
    class BankB extends Bank{
         //overriding parent class method
        void getBalance(){
            System.out.print("Bank B: ");
            getBalance(1500);  //calling the method in super class
        }
    }
    //bankc  class extending bank class
    class BankC extends Bank{
         //overriding parent class method
        void getBalance(){
            System.out.print("Bank c: ");
            getBalance(2000);  //calling the method in super class
        }
    }
public class Excersice6 {
    public static void main(String[] args) {
       //creating instance for the parent class
       Bank obj = new Bank();
       obj.getBalance(0);//It returns '0'
       //craeting objects for 3 classes
       BankA a = new BankA();
       BankB b = new BankB();
       BankC c = new BankC();
       //print the amounts deposited by boy by getBalance method
       a.getBalance();
       b.getBalance();
       c.getBalance();
    }
}