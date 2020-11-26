 class  Bank  //grand parent  class
{
    int  getBank() //method for grand parent
    {
        int a=0;
        return a;
    }
}
    class BankA extends Bank //parent class getting properties from grsnd parent
    {
        int  getBank() //method for parent class
            {
                int b=1000;
                return b;
            }
    }
    class   BankB extends Bank  // child class getting properties from grand parent 
    {
        int getBank() // method for child class
        {
            int c=1500;
            return c;
        }
    }
     class BankC extends Bank // grand child getting properties from garnd parent 
     {
         int getBank() //method for grandchild
         {
             int d=2000;
             return d;
         }    
        
    }
    class BankAccount
    {
        public static void main(String[] args)
         {
            BankC c=new BankC(); // objection for grand child  class
            c.getBank(); //calling the method with object from  grandchild class
            BankB b=new BankB(); //objection for  child  class
            b.getBank();//calling the method with object from child class
            BankA a=new BankA(); //objection for parent class
            a.getBank(); //calling the method with object fron parent  class
            Bank n=new Bank(); //objection for grand parent class
            n.getBank(); //calling the method with object from grand parent class
        }
    }

