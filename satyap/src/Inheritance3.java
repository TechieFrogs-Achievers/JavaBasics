// using Inheritance of Member ,Employee,Manager

class Member
{
    String name="satya"; // datamember for Member class 
    int age=20;
    long Phonenum=648899849;
    String address="Ndd";
    float salary=50000;
    void printSalary() // method for member
    {
        System.out.println("salary:"+salary);
    }
    
}
class Employee1 extends Member
{
    String specilization; // datamember for Employee class
    void display()
    {
        System.out.println(name+" "+age+" "+Phonenum+" "+address);
    } 
}
class Manager extends Member
{
    String department; // datamember for Manager class
    void show()
    {
        System.out.println(name+" "+age+" "+Phonenum+" "+address);

    }
    

}
public class Inheritance3
{
    public static void main(String[] args) {
        Manager m=new Manager(); // obj for manager
        m.printSalary(); // method call for parent class by child obj
        m.show();// method call for child class by child obj
        Employee1 em= new Employee1(); // obj creating for subparent class 
        em.display(); // methid call for subparent class
        
    }
}