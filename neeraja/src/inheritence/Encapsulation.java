package inheritence;

//to achieve both encapsulation and inheritence
//super class
class Account
{
    //private data
    private long account_no;
    private String name;


    //super class constructor
    public Account(long account_no, String name)
    {
        this.account_no=account_no;
        this.name=name;
    }

    //getter methods to get data
    public String getName()
    {
        return name;
    }
    public long getAccount_no()
    {
        return account_no;
    }

}

//derived class
class SavingsAccount extends Account
{

    private double balance;
    //derived class constructor
    public SavingsAccount(long account_no, String name,double balance)
     {
         //calling super class constructor
        super(account_no, name);
        this.balance=balance;
    }
    //getter to get data
    public double getBalance()
    {
        return balance;
    }
    
}

     //main class
public class Encapsulation
{
    public static void main(String[] hb)
    {
        //parameterised derived class constructor
       SavingsAccount s=new SavingsAccount(123456756L,"neeraja",25000);

       System.out.println("---------------Account enquiry-------------------");
       System.out.println("Account no         :"+s.getAccount_no());
       System.out.println("Account holder name:"+s.getName());
       System.out.println("Account balance    :"+s.getBalance());
    }
    
}
