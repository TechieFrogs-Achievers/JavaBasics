import java.nio.charset.MalformedInputException;

public class Bank 
{
   //method for retuns 0
   public float getBalance()
   {
      return(0);
   }
   public static void main(String[] args) 
   {
      BankA a=new BankA();//creating object for class BnakA
     System.out.println("From BankA Deposited amount is:"+a.getBalance()); //method calling
     BankB b=new BankB();//creating object for class BnakB
     System.out.println("From BnakB Deposited amount is:"+b.getBalance());//method calling
     BankC c=new BankC();//creating object for class BnakC
     System.out.println("From BankC Deposited amount is:"+c.getBalance()); //method calling
   } 
}
//inherite method from bank to bankA
class BankA extends Bank
{
   //method for print the deposited amount
  public float getBalance()
  {
     float deposited_amount=1000;
     return deposited_amount; 
  }
}
//inherite method from bank to bankB
class BankB extends Bank
{
   //method for print the deposited amount
   public float getBalance()
   {
      float deposited_amount=1500;
      return deposited_amount; 
   }
}
//inherite method from bank to bankC
class BankC extends Bank
{
   //method for print the deposited amount
   public float getBalance()
   {
      float deposited_amount=2000;
      return deposited_amount; 
   }
}