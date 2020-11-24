

class Member
{
    String name;
    int age;
    long phno;
    String Address;
    float salary;
    public void printsalary()
    {
        System.out.println("the salary of jemima is :"+salary);
    }
}
class Employee extends Member
{
    String Specialization;

}
class Manager extends Member
{
    String department;

}
public class InheritanceExercise3
 {
     public static void main(String[] args)
      {
        Employee e = new Employee();
        e.name="jemima";
        e.age=21;
        e.phno=9874632;
        e.Address="angara";
        e.Specialization="employee";
        e.salary=9754478.2365f;
        Manager m = new Manager();
        m.department="software";
        System.out.println("name :" + e.name+  " \n" + " age :"+e.age+ "\n"+ "phno" + e.phno+ "\n"+ "address:" +e.Address+"\n"+"specilization"+e.Specialization+ "\n "+ "department"+m.department);
        e.printsalary();
         
     }
     



    
}
