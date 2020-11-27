abstract class Bank1 // abstract  class 
{
   abstract int getBalance(); //abstract method 
}
class BankA extends Bank1 // parent getting properties from abstract class
{
   public int getBalance() //method for parent class
    {
       // System.out.println("deposited");
       return 100;
    }
}
    class BankB extends Bank1 //child getting properties from abstract class
    {
        public int getBalance() //method for child class
        {
    //System.out.println("credited");
         return 150;
    }
    }
    class Bankc extends Bank1 //grand child getting properties from abstract class
    {
         public int getBalance() ///method for grand child class
         {  
            return 200;
        }
    }
    public class AbstractclassBank
    {
    public static void main(String[] args) 
        {
            Bank1 b=new BankA(); // upcasting  created parent class object refernce to childclass
            Bank1 b1=new BankB();
            Bank1 b2=new Bankc(); 
            //Bank1 b3=new BankA();
            //b.getBalance();
            System.out.println( b.getBalance()); //calling method with parent class object 
            // b1.getBalance();
            System.out.println(b1.getBalance());
           // b2.getBalance();
            System.out.println(b2.getBalance());
        }
    }

