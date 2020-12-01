package AbstractionExamples;

abstract class Bank //abstract class
{   
    double balance; //variable 
    abstract void getBalnace(); //abstract method
    
}  

class BankA extends Bank//sub class1
{  
    double balance =100;
    void getBalnace() //implementation of abstrct method
    {
        System.out.println("bankA balance   :" +balance);
    }
}  
class BankB extends Bank //sub class2
{  
    double balance =150;
    void getBalnace() //implementation of abstrct method
    {
        System.out.println("bankB  balance  :" +balance);
    }
}  
class BankC extends Bank//sub class3
{  
    double balance =200;
    void getBalnace()//implementation of abstrct method
    {
        System.out.println("bankC balance  :" +balance);
    }
} 
public class Program2 
{
    public static void main(String[] args)
    { 
        //obj creation
       BankA b1 = new BankA();
       BankB b2 = new BankB();
       BankC b3 = new BankC();
       //method call
       b1.getBalnace();
       b2.getBalnace();
       b3.getBalnace();

    }
    
}
