
// Method Overriding 
class Bank // parent class for Bank
{
    public int getRateOfInterest() // method for getRateOfInterest()
    {
        return 0;
    }
}
class SBI extends Bank // subclass of SBI for bank class
{
    public int getRateOfInterest() // same method getRateOFInterest()
    {
        return 1000;
    }
}
class ICICI extends Bank // subclass of ICICI for bank class
{
    public int getRateOfInterest() // same method getRateOfInterest()
    {
        return 1500;
    }
}
class RBI extends Bank // subclass RBI for Bank class
{
    public int getRateOfInterest() // same method getRateOfIntrest()
    {
        return 2000;
    }
}
class MethodOverriding // main class
{
    public static void main(String[] args)
    {
    SBI s =new SBI(); // obj for SBI class
    System.out.println("SBI rate of interest:"+s.getRateOfInterest());
    ICICI i=new ICICI(); // obj for ICICI class
    System.out.println("SBI rate of interest:"+i.getRateOfInterest());
    RBI r=new RBI(); // obj for RBI class
    System.out.println("SBI rate of interest:"+r.getRateOfInterest());
    Bank b=new Bank();
    b.getRateOfInterest();

    }
}

