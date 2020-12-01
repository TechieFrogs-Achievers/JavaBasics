abstract class SBI
{
    abstract void getmethode();//abtract methode
}
class SBIA extends SBI//class extend
{
  void getmethode()//methode
  {
      System.out.println("Bank A deposited in:"+ "$100");
  }
}
class SBIB extends SBI//class extend
{
    void getmethode()//methode
    {
        System.out.println("Bank B deposited in:" +"$150");
    }
}
class SBIC extends SBI//class extend
{
    void getmethode()
    {
        System.out.println("Bank C deposited in:" +"$200");
    }
}
public class AbstractBank
{
    public static void main(String[] args) 
    {
        SBI a=new SBIA();
        a.getmethode();
        SBI b=new SBIB();
        b.getmethode();
        SBI c=new SBIC();
        c.getmethode();
    }
}