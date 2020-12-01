public class AbstractExcercise2 
{
    public static void main(String[] args) 
    {
        BankX ba=new BankX1();//object creation
         ba.getBalance();//method calling
         BankX bb=new BankX2();//object creation
         bb.getBalance();//method calling
         BankX bc=new BankX3();//object creation
         bc.getBalance();//method calling
         //BankX1 ba=new BankX1();//object creation
         //ba.getBalance();//method calling
         //BankX2 bb=new BankX2();//object creation
         //bb.getBalance();//method calling
         //BankX3 bc=new BankX3();//object creation
         //bc.getBalance();//method calling

    }
    
}
//abstract class 
abstract class BankX
{
    abstract void getBalance();//abstract method
}
class BankX1 extends BankX//subclass of abstract class
{
    void getBalance()
    {
        System.out.println("$100");
    }
}
class BankX2 extends BankX//subclass of abstract class
{
    void getBalance()
    {
        System.out.println("$150");
    }
}
class BankX3 extends BankX//subclass of abstract class
{
    void getBalance()
    {
        System.out.println("$200");
    }
}