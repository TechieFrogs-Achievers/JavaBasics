class Bank 
{
    
    public int  getbalance()//creating method
    {
        return 0;// return 0
    }
    
}
class BankA
{
     String getbalance(String deposit1)// creating method 
    {
       return deposit1;// retun BankA deposit value  

    }
}
class BankB
{
    String getbalance(String deposit2)// creating method 
    {
        return deposit2;// retun BankB deposit value
    }
}
class BankC
{
    String getbalance( String deposit3)// creating method 
    {
        return deposit3;//// retun BankC deposit value
    }
}
public class Method6
{
    public static void main(String[] args)
    {   
        //super class method
        Bank B = new Bank();
        B.getbalance();// calling method with object
        System.out.println("default value for bank :" + B.getbalance());
        //creating method for sub class
        BankA a = new BankA();
        BankB b = new BankB();
        BankC c = new BankC();
        // calling methods 
        System.out.println("BankA deposit :"  +a.getbalance("$1000"));
        System.out.println(" BankB deposit :" +b.getbalance("$1500"));
        System.out.println(" BankC deposit :" +c.getbalance("$2000"));
    

        
    }
}
