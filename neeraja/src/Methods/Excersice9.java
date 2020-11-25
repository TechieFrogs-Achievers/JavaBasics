package Methods;

//composition object
class Customer
{
    // instance members
    String name;
    String mail;
    // constructor to initialize instance members
    public Customer(String name,String mail)
    {
      this.name=name;
      this.mail=mail;
    }
    //accessor method to retrive name
    public String getName()
    {
        return name;
    }
    //accessor method to retrive mail
    public String getEmail()
    {
        return mail;
    }
}

//composition object
class Account
{
    // instance members
    long account_no;
    long ifsc;
    // constructor to initialize instance members
    public Account(long account_no,long ifsc)
    {
        this.account_no=account_no;
        this.ifsc=ifsc;
    }
    //accessor method to retrive accountno
    public long getAccount_no()
    {
        return account_no;
    }
    //accessor method to retrive ifsc code
    public long getIfsc()
    {
        return ifsc;
    }
}

//parent(RBI) class for SBI AND ICICI 
class RBI{
    //instance members
    int rateOfInterest;
    double withdrawalLimit;

    //instantiation and initialization of composition objects
    Customer c=new Customer("neeraja","neerajabejawada@gmail.com");
    Account a=new Account(00056564L,01556545L);

    //parent class constructor 
   public  RBI(int rateOfInterest, double withdrawalLimit) 
    {
     this.rateOfInterest=rateOfInterest;
     this.withdrawalLimit=withdrawalLimit;
    }
    //accessor method to retrive limit
    public double getWithdrawalLimit(){
       return  withdrawalLimit;
    }
    //accessorto retrive interest
    public double getRateOfInterest()
    {
        return  rateOfInterest;
    }
    //instance method 
    void minimumBalance(double balance)
    {
        System.out.println("RBI");
    }
}


//class sbi extending the class rbi
class SBI extends RBI
{
    //child class constructor
    public SBI(int rateOfInterest, double withdrawalLimit) {
        super(rateOfInterest, withdrawalLimit);//cals super class constructor
    }
    //public method(overriding method) to return minimun balance
    public void minimumBalance(double balance) {
     double  minimun_balance=balance;
     System.out.println("SBI minimum balance  :"+minimun_balance);
    }
}


//class icici extending the class rbi
    class ICICI extends RBI
{
    //child class constructor
    public ICICI(int rateOfInterest, double withdrawalLimit) {
        super(rateOfInterest, withdrawalLimit);//cals super class constructor
     }
    //public method(overriding method) to return minimun balance
    void minimumBalance(double balance) {
     double  minimun_balance=balance;
     System.out.println("ICICI minimum balance :"+minimun_balance);
        
    }
}
    


public  class Excersice9 {
    public static void main(String[] a) 
    {
        //instantiation and initialization of parent class RBI(enclosing object)
        RBI r=new RBI(4,10000L);
        System.out.println("--------------------------------------");

        System.out.println("RBI LIMIT            :"+r.getWithdrawalLimit());
        System.out.println("RBI INTEREST         :"+r.getRateOfInterest());

        //instantiation and initialization of class sbi
        SBI s=new SBI(5,10000);
        System.out.println("--------------------------------------");

        s.minimumBalance(5200L);
        System.out.println("SBI LIMIT             :"+s.getWithdrawalLimit());
        System.out.println("SBI INTEREST          :"+s.getRateOfInterest());

        //instantiation  and initialization of class icici
        ICICI i=new ICICI(6,20000);
        System.out.println("--------------------------------------");

        i.minimumBalance(5200L);
        System.out.println("ICICI LIMIT           :"+i.getWithdrawalLimit());
        System.out.println("ICICI INTEREST        :"+i.getRateOfInterest());

        //accesseing composition objects customer and account 
        //using enclosing object
        System.out.println("--------------------------------------");
        System.out.println("name of customer      :"+r.c.getName());
        System.out.println("mail of customer      :"+r.c.getEmail());
        System.out.println("account no of customer:"+r.a.getAccount_no());
        System.out.println("account no of ifsc    :"+r.a.getIfsc());

        //accesing composition object using child class reference
        System.out.println("mail  no of customer  :"+s.c.getEmail());
        System.out.println("name no of customer   :"+i.c.getName());


      /*  r=new SBI(5,10000);
          r=new ICICI(6,20000);
          //polymorphism
          r.minimumBalance(5200L);
          r.minimumBalance(5200L);

          System.out.println("SBI LIMIT             :"+r.getWithdrawalLimit());
          System.out.println("SBI INTEREST          :"+r.getRateOfInterest());
          System.out.println("ICICI LIMIT           :"+r.getWithdrawalLimit());
          System.out.println("ICICI INTEREST        :"+r.getRateOfInterest());    */

    }

}

