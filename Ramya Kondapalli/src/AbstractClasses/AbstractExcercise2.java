package AbstractClasses;
//abstract class
abstract class Bank{
    abstract void getBalance(int x);  //abstract method
}
class BankA extends Bank{
    //abstract method implementation
    void getBalance(int x){
        System.out.println("Bank A : $"+x);
    }
}
class BankB extends Bank{
    //abstract method implementation
    void getBalance(int x){
        System.out.println("Bank B : $"+x);
    }
}
class BankC extends Bank{
    //abstract method implementation
    void getBalance(int x){
        System.out.println("Bank C : $"+x);
    }
}
//main method
public class AbstractExcercise2 {
    public static void main(String[] args) {
        //creating objects for the subclasses
        BankA a = new BankA();
        BankB b = new BankB();
        BankC c = new BankC();
        //calling method through objects and passing values
        a.getBalance(100);
        b.getBalance(150);
        c.getBalance(200);
    }
}
