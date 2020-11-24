package inheritence;

//parent class
class Member
{
    String name; 
    int age;
    long phoneNumber;
    String address;
    float salary;
    //method to print salary
    public void printSalary()
    {
        System.out.println(salary);
    }
}

//employee class for printing specialization
class Employee extends Member
{
    String speciliazation;
    //System.out.println(specialization);
}

//managers class
class Manager extends Member
{
    String departement;
    //System.out.println(departement);
    
}

public class Multilevel 
{
    public static void main(String[] args)
     {
         //employee object and assigning values to employee members
        Employee e = new Employee();        
        e.name = "nag";                       
        e.age = 22;
        e.phoneNumber = 985996654L;
        e.salary = 2000;
        e.address = "thanuku";
        e.speciliazation = "front-end developer";
        System.out.println(e.name+" detils");
        System.out.println(e.name +"\n" +e.age +"\n" +e.phoneNumber +"\n" +e.address +"\n" +e.speciliazation);
        e.printSalary();     
        
        ////manager object creation assigning values to manager members
        Manager m = new Manager();      
        m.departement = "developer"; 
        m.name = "ravi";
        m.age = 23;
        m.phoneNumber = 98596411L;
        m.salary = 2900;
        m.address = "Vizag";
        System.out.println(m.name+" detils");
        System.out.println(m.name +"\n" +m.age +"\n" +m.phoneNumber +"\n" +m.address +"\n" +m.departement);
        m.printSalary();
        
    }
    
}
