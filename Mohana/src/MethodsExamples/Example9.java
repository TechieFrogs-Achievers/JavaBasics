package MethodsExamples;

class Customer
{
  String name;
  String  typeofAccount;
  String address; 
  public Customer( String n , String a,String ad) //constructor 
  {
      name = n;
      typeofAccount = a;
      address = ad;
  }  
 public void display() //method to dispaly information
 {
     System.out.println( " Name : " +name + " \n"+ " type of account :" + typeofAccount +"\n"+ " Address : " +address);
 }

} 
class Account
{
    String accno;
    double balence;
    double loan; 

    public Account( String ac , double bal, double ln) //3 param constructor
    {
        accno = ac;
        balence = bal;
        loan = ln;
    }  

    public void display1()//method  to dispaly information
    {
        System.out.println( "account num : "+accno+ "\n"+ " balance : " + "\n"+ " loan ammount : " +loan);
    }
    public void getBalnce() //method to get balance
    {  
        System.out.println("Balnace amount in your accout " +balence);
    }
} 
class RBI  //parent class
{
    Customer c; //has a relation
    Account a; //has a relation

    public double getIntrestRate( double i) //overridded method
    {
        return  i;
    } 

    public double gerWithdrawLimit( double limit)//overidded method
    {
        return  limit;
    }
}
class Sbi extends RBI //inherited method
{
    public double getIntrestRate(double i) //overrided method
    {
        return i;
    } 

    public double gerWithdrawLimit( double limit) //overided method
    {
        return limit;
    }
} 
class ICICI extends RBI //inherited method
{
     public double getIntrestRate(double i)
     {
         return i;
     } 

     public double gerWithdrawLimit(double limit)
     {
         return limit;
     }
}
public class Example9 
{
    public static void main(String[] args) 
    {
         
        RBI r = new RBI();  
        r.c = new Customer("Mohana", "Savings account", "Hyderabhad");
        r.a = new Account("uywhdyudgeg", 300000, 7888);   
        //c.display();
        System.out.println( " money withdraw from your account upto : " +r.gerWithdrawLimit( 1000000d));
         System.out.println(" Rate of intrest is : " + r.getIntrestRate(2.5));
       
         
        
    }
    
}
