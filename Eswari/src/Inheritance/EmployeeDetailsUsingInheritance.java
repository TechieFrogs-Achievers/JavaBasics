package Inheritance;

//parent class as member
class Member
{
    String name; 
    int age;
    long phoneNumber;
    String address;
    float salary;
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

public class EmployeeDetailsUsingInheritance 
{
    public static void main(String[] args) {
        Employee e = new Employee();        //employee object creation
        e.name = "john";                       //assigning values to employee members
        e.age = 22;
        e.phoneNumber = 987456321;
        e.salary = 28000;
        e.address = "rajahmundry";
        e.speciliazation = "front-end developer";
        System.out.println(e.name +" " +e.age +" " +e.phoneNumber +" " +e.address +" " +e.speciliazation);
        e.printSalary();            //calling method
        Manager m = new Manager();      //manager object creation
        m.departement = "software developer"; 
        m.name = "sam";
        m.age = 23;
        m.phoneNumber = 987456321;
        m.salary = 29000;
        m.address = "Hyderabad";
        System.out.println(m.name +" " +m.age +" " +m.phoneNumber +" " +m.address +" " +m.departement);
        m.printSalary();
        
    }
    
}
