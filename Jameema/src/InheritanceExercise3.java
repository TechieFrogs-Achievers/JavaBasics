class Member //parent class 
{
    String name;
    int age;
    long phno;
    String Address; //data members
    float salary;
    public Member() //default constructor
    {
        System.out.println("parent constructor");
    }
    public void printsalary() //method
    {
        System.out.println("the salary of jemima is :"+salary);
    }
}
class Employee extends Member //inherits the parent class details
{
    String Specialization;
    public Employee() //child cladd constructor
    {
        System.out.println("child constructor");
    }

}
class Manager extends Member
{
    String department;

}
public class InheritanceExercise3
 {
     public static void main(String[] args)
      { 
        Employee e = new Employee(); //creating object to child class 
        e.name="jemima";
        e.age=21;
        e.phno=9874632; // calling variables by using child class object and assigning value
        e.Address="angara";
        e.Specialization="employee";
        e.salary=9754478.2365f;
        Manager m = new Manager();
        m.department="software";
        System.out.println("name :" + e.name+  " \n" + " age :"+e.age+ "\n"+ "phno" + e.phno+ "\n"+ "address:" +e.Address+"\n"+"specilization"+e.Specialization+ "\n "+ "department"+m.department);
        e.printsalary(); //printing the values
         
     }
     



    
}
