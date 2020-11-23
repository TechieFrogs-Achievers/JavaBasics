class Member //creating class name as member
{
    String Name;
    int age;
    long PhoneNumber;
    String Address;
    int Salary;
    void PrintSalary() //create method for printsalary
    {
        System.out.println(Salary);
    }  
}
    class Employee1 extends Member //inherit the employee1 with class 
    {
        String specialization; //assign datamember 
    }
    class Manager extends Member //inherit manager with class
    {
        String department; //assign datamember
    }

public class Credentials 
{
    
    public static void main(String[] args) 
    {
        Employee1 e = new Employee1();//create object for the employee
        //assign the values to the objects of Employee
        e.age = 22;  
        e.Name = "Varsha";
        e.PhoneNumber = 981256475;
        e.Address = "mancherial";
        e.Salary = 30000;
        e.specialization ="accountant";
        System.out.println(e.Name+" "+e.age+" " +e.PhoneNumber+" "+e.Address+" "+e.Salary+" "+e.specialization);


        //assigns values to manager         
        Manager m = new Manager(); //create object for manager
        m.age = 23; 
        m.Name = "Saiiii";
        m.PhoneNumber = 80993838; 
        m.Address = "Bhupalpally";
        m.Salary = 36000;
        m.department ="developer";
        System.out.println(m.Name+" "+m.age+" " +m.PhoneNumber+" "+m.Address+" "+m.Salary+" "+m.department);
        
    }
}

    



