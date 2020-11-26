package InheritenceExcercises;
// Member as a parent class
class Member
{   
    //declaring the data members

    String Name;
    int Age;
    long phoneNumber;
    String Address;
    float salary;
    public void printSalary()
    {
        System.out.println("salary ="+ salary);
    }
}
// child class employee inherites  parent class

class Employee extends Member
{
    String specilization;
} 
// Manager class inherites the parent class

class Manager extends Member
{
    String department;
}
public class Inheritence3
{
    public static void main(String[] args)
    {
        // object creation for Employee

        Employee e = new Employee();

        //assigning values to employee members

        e.Name = "Durga";
        e.Age = 34;
        e.phoneNumber = 958378282;
        e.Address = "Nuzvid";
        e.salary = 30000;
        e.specilization = "full stack developer";
        System.out.println(e.Name +" " +e.Age +" " +e.phoneNumber +" " +e.Address +" " +e.specilization);
        e.printSalary();//method calling

        //manager object creation 

        Manager m = new Manager();
        
         //assigning values to manager members

        m.Name = "Neeraja";
        m.Age = 45;
        m.phoneNumber = 987456721;
        m.salary = 34000;
        m.Address = "Hyderabad";
        m.department = "web designer";
        System.out.println(m.Name +" " +m.Age +" " +m.phoneNumber +" " +m.Address +" " +m.department);
        m.printSalary();//method calling

    }
}
