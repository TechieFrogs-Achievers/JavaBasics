package InterfaceExamples;

interface Employee //interface 
{
    int roll = 123; //by default final static and public 
    
    void details(); // public abstract method by default
}

class Company implements Employee
{
    public void details()//implementation of abstract method
    {
        System.out.println("interface class method ");
    }
}

public class Example1 
{
    public static void main(String[] args) 
    {
        Company cmp = new Company();
        cmp.details();
        System.out.println(Company.roll); //roll is by default a static variable so we can access by class name
    }
    
}
