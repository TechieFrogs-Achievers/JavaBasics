package abstraction;

//abstract class
abstract class Bank{
   abstract void getBalance(long balance);
}

//subclass one providing body to absract method getbalance()
class BankA extends Bank{
    void getBalance(long balance){
   long bal=balance;    //implementing abstract method
   System.out.println("money deposited in BankA is: $"+bal);
    }
}

//subclass two providing body to absract method getbalance()
   class BankB extends Bank{
    void getBalance(long balance){
   long bal=balance;   //implementing abstract method
   System.out.println("money deposited in BankB is: $"+bal);
 }
}

////subclass three providing body to absract method getbalance()
class BankC extends Bank{
    void getBalance(long balance){
   long bal=balance;    //implementing abstract method
   System.out.println("money deposited in BankC is: $"+bal);
    }
}

//main class
public class ExcersiceTwo {
    public static void main(String[] td)
    {
        //Achieving polymorphism by creating reference of abstract class
       
        Bank bone;
        bone=new BankA();//instantiation of bankA using parent class reference
        bone.getBalance(100);//calling getBalance method using bank reference

        bone=new BankB();//instantiation of bankB using parent class reference
        bone.getBalance(150);//calling getBalance method using bank reference

        bone=new BankC();//instantiation of bankC using parent class reference
        bone.getBalance(200);//calling getBalance method using bank reference
    }
}
