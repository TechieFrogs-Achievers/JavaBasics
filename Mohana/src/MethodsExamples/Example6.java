package MethodsExamples;

class Bank //parent class
{
   public void getBalance()
   {
       return ;
   } 
}  
class BankA extends Bank //sub class extends parent
{ 
    int deposited = 1000;
    public void getBalance() //overriden method
    {
        System.out.println( "Bank A has Balnce is " +deposited);
    }

} 
class BankB extends Bank //sub class extends parent
{  
    int deposited = 1500;
    public void getBalance() //method to dispaly balance
    {
        System.out.println( " Bank B  has Balnce is " +deposited);
    }

}  
class BankC  extends Bank //sub class extends parent
{ 
    int deposited = 2000;
    public void getBalance() //method to display balance
    {
        System.out.println( "Bank C has  Balnce is " +deposited);
    }

} 
public class Example6 
{  
    public static void main(String[] args) 
    {
        //Bank b = new Bank();  

        //creating objects to each class 

        BankA ba = new BankA(); 
         BankB bb = new BankB();
         BankC bc = new BankC(); 
            
         //calling methods
         
        ba.getBalance(); 
        bb.getBalance();
        bc.getBalance();
        
    }
    
}
