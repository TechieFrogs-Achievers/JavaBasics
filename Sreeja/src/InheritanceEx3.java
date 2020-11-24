class Member
{
    String name;
    int age;            //defining data members
    long phoneNumber;
    String address;
    float salary;

    public void printSalary()       //method to print salary
    {
        System.out.println("Salary is:  "+salary);
    } 
}

class Employee2 extends Member      //employee class inheriths member class
{
    String specialization;              
}
class Manager extends Member    //manager class inherits member class
{
    String department;
}


public class InheritanceEx3
 {
    
     public static void main(String[] args) 
     {
        
        Employee2 emp = new Employee2();        //object creation for employee class
        Manager mr = new Manager();             //object creation for manager class

        mr.name = "Sreeja"; 
        mr.age = 21;
        mr.phoneNumber = 4564564327l;       //assigning values to the data members with object of employee 
        mr.address = "vizag";
        mr.salary = 25000;
        mr.department = "Development";

        //printing manager details

        System.out.println("MANAGER: ");
        System.out.println("Name: "+mr.name+"  "+"Age:"+mr.age+"  "+"Phonenumber: "+mr.phoneNumber+"  "+"Address:"+mr.address);
        mr.printSalary();
        

        emp.name = "Sree";
        emp.age = 22;
        emp.phoneNumber = 2345678991l;
        emp.address = "kerala";                     //assigning values to the data memebers with object of employee
        emp.salary = 20000;
        emp.specialization = "Front-end developer";
       
        //printing employee details
        
        System.out.println("EMPLOYEE");
        System.out.println("Name: " +emp.name+"  "+"Age: "+emp.age+"  "+"Phonenumber:"+emp.phoneNumber+"  "+"Address:"+emp.address);
        emp.printSalary();
     }
}

